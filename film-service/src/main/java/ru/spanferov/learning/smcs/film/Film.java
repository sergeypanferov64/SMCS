package ru.spanferov.learning.smcs.film;

public class Film {


    private Long id;
    private String title;
    private String director;
    private Integer year;

    public Film() {
    }

    public Film(Long id, String title, String director, Integer year) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.year = year;
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
