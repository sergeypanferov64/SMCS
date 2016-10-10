package ru.spanferov.learning.smcs.book;

import java.util.List;

public class Book {


    private Long id;
    private String title;
    private String author;
    private Integer yaer;
    private List<Long> relatedFilms;

    public Book() {
    }

    public Book(Long id, String title, String author, Integer yaer, List<Long> relatedFilms) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.yaer = yaer;
        this.relatedFilms = relatedFilms;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYaer() {
        return yaer;
    }

    public void setYaer(Integer yaer) {
        this.yaer = yaer;
    }

    public List<Long> getRelatedFilms() {
        return relatedFilms;
    }

    public void setRelatedFilms(List<Long> relatedFilms) {
        this.relatedFilms = relatedFilms;
    }
}
