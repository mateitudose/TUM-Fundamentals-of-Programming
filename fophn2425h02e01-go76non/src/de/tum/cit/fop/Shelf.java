package de.tum.cit.fop;

import java.util.Arrays;

/**
 * The {@code Shelf} class represents a shelf within a section, which holds a fixed number of books.
 * Provides functionality to check shelf utilization and add books.
 */
public class Shelf {
    //TODO 1: Attributes
    private final Section section;
    private final Book[] bookArray;

    /**
     * Constructs a {@code Shelf} associated with the specified section.
     *
     * @param section the section this shelf belongs to
     */
    //TODO 2: Implement the Constructor

    public Shelf(Section section) {
        this.section = section;
        this.bookArray = new Book[15];
    }

    /**
     * Checks if the shelf is fully utilized (i.e., contains no empty slots for books).
     *
     * @return {@code true} if all slots on the shelf are filled, {@code false} otherwise
     */
    public boolean isUtilized() {
        //TODO 3.1: Implement the logic behind the method
        for (Book book : bookArray) {
            if (book == null) {
                return false;
            }
        }
        return true;
    }

    /**
     * Attempts to add a book to the first available slot on the shelf.
     *
     * @param newBook the book to be added
     * @return {@code true} if the book is successfully added, {@code false} if the shelf is full
     */
    public boolean addBook(Book newBook) {
        //TODO 3.2: Implement the logic behind the method
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i] == null) {
                bookArray[i] = newBook;
                return true;
            }
        }
        return false;
    }

    //TODO 1: Getters and Setters

    public Section getSection() {
        return section;
    }

    public Book[] getBookArray() {
        return bookArray;
    }

    //TODO: toString() Method

    @Override
    public String toString() {
        return "Shelf{" +
                "section=" + section +
                ", bookArray=" + Arrays.toString(bookArray) +
                '}';
    }
}
