package de.tum.cit.fop;

import java.util.UUID;

public abstract class User {
    private String name;
    private boolean isBookAuthor;
    private final UUID id;

    protected User(String name, boolean isBookAuthor) {
        this.name = name;
        this.isBookAuthor = isBookAuthor;
        this.id = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBookAuthor() {
        return isBookAuthor;
    }

    public void setBookAuthor(boolean bookAuthor) {
        isBookAuthor = bookAuthor;
    }

    public UUID getId() {
        return id;
    }
}
