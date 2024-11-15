package de.tum.cit.fop;

public class Program {
    private String title;
    private int credits;
    private String courseLanguage;
    private String location;

    public Program(String title, int credits, String courseLanguage, String location) {
        this.title = title;
        this.credits = credits;
        this.courseLanguage = courseLanguage;
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getCourseLanguage() {
        return courseLanguage;
    }

    public void setCourseLanguage(String courseLanguage) {
        this.courseLanguage = courseLanguage;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Program{" +
                "title='" + title + '\'' +
                ", credits=" + credits +
                ", courseLanguage='" + courseLanguage + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public String getDisplayName() {
        return title + " (at TUM Campus " + location + ")";
    }
}
