package de.tum.cit.fop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class LibraryUser extends User {
    private final Library library;
    private final List<Book> books;

    public LibraryUser(String name, boolean isBookAuthor, Library library) {
        super(name, isBookAuthor);
        this.library = library;
        this.books = new ArrayList<>();
    }

    public Library getLibrary() {
        return library;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        if (!books.contains(book))
            books.add(book);
    }

    // TODO: There is something missing here...
    public void readBooks(int pagesToRead) {
        int pagesLeft = pagesToRead;

        for (Book book : books) {
            if (pagesLeft <= 0) break;
            List<Page> pages = book.getPages();
            Page currentLast = book.getLastPageRead();
            if (pages.isEmpty() || (currentLast != null && currentLast == pages.get(pages.size() - 1))) {
                continue;
            }
            int nextPageIndex = (currentLast == null) ? 0 : pages.indexOf(currentLast) + 1;
            int remainingPagesBook = pages.size() - nextPageIndex;
            int pagesToReadHere = Math.min(remainingPagesBook, pagesLeft);
            if (pagesToReadHere > 0) {
                book.setLastPageRead(pages.get(nextPageIndex + pagesToReadHere - 1));
            }
            pagesLeft -= pagesToReadHere;
        }
    }

    public void setFavouriteBook(String name) {
        for (Book book : books) {
            if (Objects.equals(book.getName(), name))
                book.setFavourite(true);
        }
    }

    public void returnBooksToTheLibrary() {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (!book.getPages().isEmpty() && book.getPages().get(book.getPages().size() - 1).equals(book.getLastPageRead())) {
                library.returnBook(book);
                iterator.remove();
            }
        }
    }
}
