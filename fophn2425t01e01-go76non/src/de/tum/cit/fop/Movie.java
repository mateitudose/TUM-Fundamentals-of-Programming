package de.tum.cit.fop;

public class Movie {
    private String title;
    private int releaseYear;

    public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String toString() {
        return "Movie{" + "title='" + title + "\'" + ", releaseYear=" + releaseYear + "}";
    }

    public String greet() {
        return "Hello, welcome to the screening of " + title;
    }
}
