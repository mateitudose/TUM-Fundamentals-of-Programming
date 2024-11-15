package de.tum.cit.fop;

public class QuidditchTrainer extends Participant{
    private Lecture lecture;

    public QuidditchTrainer(String firstName, String lastName, String hogwartsID, Lecture lecture) {
        super(firstName, lastName, hogwartsID);
        this.lecture = lecture;
    }

    @Override
    public String toString() {
        return "Quidditch Trainer " + super.getName();
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }
}
