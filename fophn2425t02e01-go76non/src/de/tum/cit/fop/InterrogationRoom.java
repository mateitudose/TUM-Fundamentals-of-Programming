package de.tum.cit.fop;

public class InterrogationRoom {
    private final Interrogator interrogator;

    public InterrogationRoom(Interrogator interrogator) {
        this.interrogator = interrogator;
    }

    public Interrogator getInterrogator() {
        return interrogator;
    }

    public void interrogate(Penguin alice, Penguin bob) {
        if (alice.getChoice().equals("S") && bob.getChoice().equals("S")) {
            alice.setPrisonTime(1);
            bob.setPrisonTime(1);
        } else if (alice.getChoice().equals("S") && bob.getChoice().equals("B")) {
            alice.setPrisonTime(3);
            bob.setPrisonTime(0);
        } else if (alice.getChoice().equals("B") && bob.getChoice().equals("S")) {
            alice.setPrisonTime(0);
            bob.setPrisonTime(3);
        } else if (alice.getChoice().equals("B") && bob.getChoice().equals("B")) {
            alice.setPrisonTime(2);
            bob.setPrisonTime(2);
        }
    }

    public void interrogatorUsesTactics(Penguin alice, Penguin bob) {
        if (interrogator.getTactic().equals("O")){
            if (alice.getChoice().equals("B")){
                alice.setPrisonTime(alice.getPrisonTime() - 1);
            }
            if (bob.getChoice().equals("B")){
                bob.setPrisonTime(bob.getPrisonTime() - 1);
            }
        }
        else if (interrogator.getTactic().equals("T")){
            if (alice.getChoice().equals("S")){
                alice.setPrisonTime(alice.getPrisonTime() + 1);
            }
            if (bob.getChoice().equals("S")){
                bob.setPrisonTime(bob.getPrisonTime() + 1);
            }
        }
    }
}
