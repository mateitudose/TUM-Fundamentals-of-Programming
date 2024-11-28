package de.tum.cit.fop;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private final String name;
    private final String authorName;
    private Page lastPageRead;
    private boolean isFavourite;
    private final List<Page> pages;
    private User currentUser;

    public Book(String name, String authorName) {
        this.name = name;
        this.authorName = authorName;
        this.pages = new ArrayList<>();
    }

    public Book(String name, String authorName, List<Page> pages) {
        this.name = name;
        this.authorName = authorName;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public Page getLastPageRead() {
        return lastPageRead;
    }

    public void setLastPageRead(Page lastPageRead) {
        this.lastPageRead = lastPageRead;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }

    public List<Page> getPages() {
        return pages;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public void addPage(Page page) {
        if(!pages.contains(page))
            pages.add(page);
    }
}
