package ru.spanferov.learning.smcs.book;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping
public class BookController implements CommandLineRunner {

    @Autowired
    private FilmsClientBean filmsClient;

    public static List<Book> books = new ArrayList<Book>();

    public void run(String... strings) throws Exception {
        books.add(new Book(1L, "Война и мир", "Лев Толстой", 2004, Arrays.asList(4L,5L)));
        books.add(new Book(2L, "Преступление и наказание", "Фёдор Достоевский", 2014, null));
        books.add(new Book(3L, "Тихий Дон", "Михаил Шолохов", 2014, Arrays.asList(6L)));
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Book> list() {
        return books;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Book get(@PathVariable Long id) {
        return books.stream().filter(b -> b.getId().equals(id)).findFirst().get();
    }

    @RequestMapping(value = "/{id}/withFilms", method = RequestMethod.GET)
    public BookWithFilms getWithFilms(@PathVariable Long id) {
        Book book = books.stream().filter(b -> b.getId().equals(id)).findFirst().get();
        List<Film> films = filmsClient.list(book.getRelatedFilms());
        return new BookWithFilms(book, films);
    }


    @Component
    class FilmsClientBean {

        @Autowired
        private FilmsClient filmsClient;

        @HystrixCommand(fallbackMethod = "defaultFilms")
        public List<Film> list(List<Long> ids) {
            return filmsClient.list(ids);
        }

        public List<Film> defaultFilms(List<Long> ids) {
            return new ArrayList<Film>();
        }
    }

}
