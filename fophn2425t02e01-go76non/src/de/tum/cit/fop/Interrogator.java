package de.tum.cit.fop;

public class Interrogator {
    private String name;
    private String tactic;

    public Interrogator(String name) {
        this.name = name;
        this.tactic = "NONE";
    }

    public String getTactic() {
        return tactic;
    }

    public void setTactic(String tactic) {
        this.tactic = tactic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
