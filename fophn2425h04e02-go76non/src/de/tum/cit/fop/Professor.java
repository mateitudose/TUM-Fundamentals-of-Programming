package de.tum.cit.fop;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Participant {
    private String title;
    private List<Lecture> lectures;

    public Professor(String firstName, String lastName, String hogwartsID, String title) {
        super(firstName, lastName, hogwartsID);
        this.title = title;
        lectures = new ArrayList<Lecture>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(List<Lecture> lectures) {
        this.lectures = lectures;
    }

    @Override
    public String toString() {
        return title + " " + getName();
    }

    // TODO: Fix this to filter the lectures
    public void addLecture(Lecture lecture) {
        lectures.add(lecture);
    }

    public void openLecture(Lecture lecture) {
        System.out.println("Welcome to the Lecture " + lecture.getName() + "! I'm Prof. " + getName() + ".");
    }

    public void closeLecture(Lecture lecture) {
        System.out.println("This is all for today. See you next week!");
    }
}
