package ru.spanferov.learning.smcs.book;

import java.util.List;

public class BookWithFilms extends Book {

    private List<Film> films;

    public BookWithFilms(Book book, List<Film> films) {
        super(book.getId(), book.getTitle(), book.getAuthor(), book.getYaer(), book.getRelatedFilms());
        this.films = films;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }
}
