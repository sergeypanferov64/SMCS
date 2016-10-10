package ru.spanferov.learning.smcs.book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping
public class BookController implements CommandLineRunner {


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
    public Book get(@PathVariable Integer id) {
        return books.get(id);
    }

}
