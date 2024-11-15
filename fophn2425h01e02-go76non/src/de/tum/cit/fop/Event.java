package de.tum.cit.fop;

public class Event {
    private String eventName;
    private String speaker;
    private int guests;
    private String location;
    private String date;

    public Event(String eventName, String speaker, int guests, String location, String date) {
        this.eventName = eventName;
        this.speaker = speaker;
        this.guests = guests;
        this.location = location;
        this.date = date;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int guests) {
        this.guests = guests;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventName='" + eventName + '\'' +
                ", speaker='" + speaker + '\'' +
                ", guests=" + guests +
                ", location='" + location + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public void registerAttendant() {
        this.guests++;
    }

    public void welcomeMessage() {
        System.out.println("Welcome to the '" + this.eventName + "' event!");
    }

    public String getEventInformation() {
        return ("'" + this.eventName + "' event will take place at " + this.location + " on " + this.date + ". Registered: " + this.guests);
    }
}
