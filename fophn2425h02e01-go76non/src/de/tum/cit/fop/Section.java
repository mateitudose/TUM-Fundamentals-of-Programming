package de.tum.cit.fop;

import java.util.Arrays;

/**
 * The {@code Section} class represents a section within a library, defined by a name and containing multiple shelves.
 * Each section can add books to its shelves based on availability.
 */
public class Section {
    //TODO 1: Attributes
    private final String sectionName;
    private final Shelf[] shelfArray;

    /**
     * Constructs a {@code Section} with the specified name.
     *
     * @param sectionName the name of the section
     */
    //TODO 2: Implement the Constructor

    public Section(String sectionName) {
        this.sectionName = sectionName;
        this.shelfArray = new Shelf[5];
    }

    /**
     * Attempts to add a new book to the first available shelf in the section.
     * Creates a new shelf if necessary.
     *
     * @param newBook the book to be added
     * @return {@code true} if the book is added successfully, {@code false} if no space is available
     */
    public boolean addToShelf(Book newBook) {
        //TODO 4: Implement the logic behind the method
        for (int i = 0; i < shelfArray.length; i++) {
            if (shelfArray[i] == null) {
                shelfArray[i] = new Shelf(this);
            }
            if (!shelfArray[i].isUtilized()) {
                return shelfArray[i].addBook(newBook);
            }
        }
        return false;
    }

    //TODO 1: Getters and Setters

    public String getSectionName() {
        return sectionName;
    }

    public Shelf[] getShelfArray() {
        return shelfArray;
    }

    //TODO: toString() Method

    @Override
    public String toString() {
        return "Section{" +
                "sectionName='" + sectionName + '\'' +
                ", shelfArray=" + Arrays.toString(shelfArray) +
                '}';
    }
}
