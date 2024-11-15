package de.tum.cit.fop;

public class Penguin {
    private String name;
    private String choice;
    private int prisonTime;

    public Penguin(String name) {
        this.name = name;
        this.choice = "NONE";
        this.prisonTime = 0;
    }

    public int getPrisonTime() {
        return prisonTime;
    }

    public void setPrisonTime(int prisonTime) {
        this.prisonTime = prisonTime;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
