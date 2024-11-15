package de.tum.cit.fop;

public abstract class Participant {
    private String firstName;
    private String lastName;
    private String hogwartsID;

    protected Participant(String firstName, String lastName, String hogwartsID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hogwartsID = hogwartsID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHogwartsID() {
        return hogwartsID;
    }

    public void setHogwartsID(String hogwartsID) {
        this.hogwartsID = hogwartsID;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public void attend(Lecture lecture) {
        lecture.addParticipant(this);
    }
}
