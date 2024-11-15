package de.tum.cit.fop;

public class WizardAide extends Participant{
    private Lecture lecture;

    public WizardAide(String firstName, String lastName, String hogwartsID, Lecture lecture) {
        super(firstName, lastName, hogwartsID);
        this.lecture = lecture;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }
}
