package de.tum.cit.fop;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Library {
    private final List<User> users;
    private final List<Book> books;

    public Library() {
        this.users = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        if (!books.contains(book))
            books.add(book);
    }

    public void addUser(User user) {
        if (!users.contains(user))
            users.add(user);
    }

    public void giveBookToUser(String name, UUID id) {
        Book currentBook = books.stream()
                .filter(book -> book.getName().equals(name))
                .findFirst()
                .orElse(null);

        if (currentBook == null) {
            System.out.println("Could not find the requested book!");
            return;
        }

        User bookUser = users.stream()
                .filter(user -> user.getId().equals(id) && !Objects.equals(currentBook.getAuthorName(), user.getName()))
                .findFirst()
                .orElse(null);

        if (bookUser == null) {
            System.out.println("Could not find the requested library user!");
            return;
        }

        currentBook.setCurrentUser(bookUser);
        if (bookUser instanceof LibraryUser) {
            ((LibraryUser) bookUser).addBook(currentBook);
        }
    }

    public Book findBook(String name) {
        for (Book book : books) {
            if (Objects.equals(book.getName(), name) || Objects.equals(book.getAuthorName(), name)) {
                if (book.getCurrentUser() != null) {
                    System.out.println("The book is already taken by another user!");
                    return null;
                }
                return book;
            }
        }
        System.out.println("Could not find the requested book!");
        return null;
    }

    public void returnBook(Book book) {
        book.setCurrentUser(null);
        book.setFavourite(false);
        book.setLastPageRead(null);
    }
}
