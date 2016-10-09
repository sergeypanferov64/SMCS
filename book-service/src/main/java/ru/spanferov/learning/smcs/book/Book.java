package ru.spanferov.learning.smcs.book;

public class Book {


    private Long id;
    private String title;
    private String isbn;
    private String author;
    private Integer publishYear;

    public Book() {
    }

    public Book(Long id, String title, String isbn, String author, Integer publishYear) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.publishYear = publishYear;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }
}
