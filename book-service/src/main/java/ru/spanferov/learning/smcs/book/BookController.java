package ru.spanferov.learning.smcs.book;

import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "books")
public class BookController implements CommandLineRunner {


    public static List<Book> books = new ArrayList<Book>();

    public void run(String... strings) throws Exception {
        books.add(new Book(1L, "Война и мир", "978-5-699-08860-7,978-5-699-35301-9", "Лев Толстой", 2004));
        books.add(new Book(2L, "Преступление и наказание", "978-5-699-65516-8", "Фёдор Достоевский", 2014));
        books.add(new Book(3L, "Тихий Дон", "978-5-389-08712-5", "Михаил Шолохов", 2014));
    }


    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<Book> list() {
        return books;
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Book get(@PathVariable Integer id) {
        return books.get(id);
    }

}
