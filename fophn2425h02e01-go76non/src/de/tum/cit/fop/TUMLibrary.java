package de.tum.cit.fop;

import java.util.Arrays;

/**
 * The {@code TUMLibrary} class represents a library with multiple sections,
 * where each section contains shelves that store books organized by genre.
 * Provides functionalities to add sections, validate new books, sort books, and
 * access library information.
 */
public class TUMLibrary {
    //TODO 1: Attributes
    private String name;
    private final Section[] sectionArray;

    /**
     * Constructs a {@code TUMLibrary} with the specified name.
     *
     * @param name the name of the library
     */
    //TODO 2: Implement the Constructor

    public TUMLibrary(String name) {
        this.name = name;
        this.sectionArray = new Section[5];
    }

    /**
     * Adds a new section to the library. If the section array is full,
     * the section will not be added.
     *
     * @param section the section to be added
     */
    public void addSection(Section section) {
        //TODO 5.1: Implement the logic behind the method
        for (int i = 0; i < sectionArray.length; i++) {
            if (sectionArray[i] == null) {
                sectionArray[i] = section;
                break;
            }
        }
    }

    /**
     * Validates and adds a new book to the appropriate section and shelf based on the book's genre.
     * If a shelf does not exist, it will attempt to create one.
     * If a book with the same ID already exists in the section, the new book will not be added.
     *
     * @param newBook the new book to be validated and added
     * @return {@code true} if the book is successfully added; {@code false} otherwise
     */
    public boolean validateNewBook(Book newBook) {
        //TODO: Uncomment this code once the Section class implementation is complete.
        Section matchingSection = null;
        for (Section section : sectionArray) {
            if ((section != null) && section.getSectionName().equals(newBook.getGenre())) {
                matchingSection = section;
                break;
            }
        }

        if (matchingSection == null) {
            return false;
        }

        //TODO 5.2: Iterate and find a place for the book

        // Does the book already exist in the section?
        for (Shelf shelf : matchingSection.getShelfArray()) {
            if (shelf == null) continue;

            for (Book book : shelf.getBookArray()) {
                if (book != null && book.getId() == newBook.getId()) {
                    return false;
                }
            }
        }

        // Add the book to the first available shelf
        return matchingSection.addToShelf(newBook);
    }

    /**
     * Sorts all books in each shelf of each section in alphabetical order by title.
     * The sorting algorithm used is Bubble Sort.
     */
    public void sort() {
        //TODO: Uncomment this code once the Section class implementation is complete.
        for (Section section : sectionArray) {
            if (section == null) continue;

            for (Shelf shelf : section.getShelfArray()) {
                if (shelf == null || shelf.getBookArray() == null) continue;
                //TODO 5.3: Implement the sorting here
                Book[] bookArray = shelf.getBookArray();
                for (int i = 0; i < bookArray.length - 1; i++) {
                    for (int j = 0; j < bookArray.length - i - 1; j++) {
                        if (bookArray[j] != null && bookArray[j + 1] != null) {
                            if (bookArray[j].getTitle().compareTo(bookArray[j + 1].getTitle()) > 0) {
                                Book temp = bookArray[j];
                                bookArray[j] = bookArray[j + 1];
                                bookArray[j + 1] = temp;
                            }
                        }
                    }
                }
            }
        }
    }

    //TODO 1: Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Section[] getSectionArray() {
        return sectionArray;
    }

    //TODO: toString() Method

    @Override
    public String toString() {
        return "TUMLibrary{" +
                "name='" + name + '\'' +
                ", sectionArray=" + Arrays.toString(sectionArray) +
                '}';
    }
}
