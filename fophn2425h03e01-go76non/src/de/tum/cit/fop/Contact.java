package de.tum.cit.fop;

public class Contact {
    private String name;
    private String phoneNumber;
    private boolean isBayernPlayer;

    public Contact(String name, String phoneNumber, boolean isBayernPlayer) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.isBayernPlayer = isBayernPlayer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean getIsBayernPlayer() {
        return isBayernPlayer;
    }

    public void setIsBayernPlayer(boolean bayernPlayer) {
        isBayernPlayer = bayernPlayer;
    }

    @Override
    public String toString() {
        return name + " can be reached at " + phoneNumber + " and he plays for the team " + (isBayernPlayer ? "FC Bayern Munich" : "FC Augsburg");
    }
}
