package de.tum.cit.fop;

import java.util.List;

public class BookAuthor extends User {
    private final Library library;

    public BookAuthor(String name, boolean isBookAuthor, Library library) {
        super(name, isBookAuthor);
        this.library = library;
    }

    public Library getLibrary() {
        return library;
    }

    public void uploadBook(String name, List<Page> pages) {
        Book toAdd = new Book(name, this.getName(), pages);
        library.addBook(toAdd);
    }
}
