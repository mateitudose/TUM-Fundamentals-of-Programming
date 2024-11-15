package de.tum.cit.fop;

/**
 * The {@code Book} class represents a book with various attributes such as title, author, publisher, year of publication,
 * genre, and a unique identifier.
 */
public class Book {
    private String title;
    private String author;
    private String publisher;
    private int year;
    private String genre;
    private final int id;

    /**
     * Constructs a {@code Book} with the specified attributes.
     *
     * @param title     the title of the book
     * @param author    the author of the book
     * @param publisher the publisher of the book
     * @param year      the year the book was published
     * @param genre     the genre of the book
     * @param id        the unique identifier for the book
     */
    public Book(String title, String author, String publisher, int year, String genre, int id) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.genre = genre;
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    //TODO: toString() Method
    /*@Override
    public String toString() {
        return title + "-" + id;
    }*/
}
