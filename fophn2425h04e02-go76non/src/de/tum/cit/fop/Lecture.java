package de.tum.cit.fop;

import java.util.ArrayList;
import java.util.List;

public class Lecture {
    private String id;
    private String name;
    private List<Apprentice> apprentices;
    private List<WizardAide> wizardAides;
    private List<QuidditchTrainer> quidditchTrainers;
    private Professor professor;
    private LectureHall lectureHall;

    public Lecture(String id, String name, Professor professor, LectureHall lectureHall) {
        this.id = id;
        this.name = name;
        this.professor = professor;
        this.lectureHall = lectureHall;
        apprentices = new ArrayList<>();
        wizardAides = new ArrayList<>();
        quidditchTrainers = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Apprentice> getApprentices() {
        return apprentices;
    }

    public void setApprentices(List<Apprentice> apprentices) {
        this.apprentices = apprentices;
    }

    public List<WizardAide> getWizardAides() {
        return wizardAides;
    }

    public void setWizardAides(List<WizardAide> wizardAides) {
        this.wizardAides = wizardAides;
    }

    public List<QuidditchTrainer> getQuidditchTrainers() {
        return quidditchTrainers;
    }

    public void setQuidditchTrainers(List<QuidditchTrainer> quidditchTrainers) {
        this.quidditchTrainers = quidditchTrainers;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public LectureHall getLectureHall() {
        return lectureHall;
    }

    public void setLectureHall(LectureHall lectureHall) {
        this.lectureHall = lectureHall;
    }

    public void addParticipant(Participant p) {
        if (p instanceof Apprentice) {
            if (apprentices.contains((Apprentice) p))
                System.out.println(p.getName() + " hogwartsID:" + p.getHogwartsID() + " already attends/holds the lecture.");
            else
                apprentices.add((Apprentice) p);
        }
        else if (p instanceof WizardAide) {
            if (wizardAides.contains((WizardAide) p))
                System.out.println(p.getName() + " hogwartsID:" + p.getHogwartsID() + " already attends/holds the lecture.");
            else {
                wizardAides.add((WizardAide) p);
                Apprentice apprentice = new Apprentice(p.getFirstName(), p.getLastName(), p.getHogwartsID());
                if (!apprentices.contains(apprentice))
                    apprentices.add(apprentice);
            }
        }
        else if (p instanceof QuidditchTrainer) {
            if (quidditchTrainers.contains((QuidditchTrainer) p))
                System.out.println(p.getName() + " hogwartsID:" + p.getHogwartsID() + " already attends/holds the lecture.");
            else {
                quidditchTrainers.add((QuidditchTrainer) p);
                Apprentice apprentice = new Apprentice(p.getFirstName(), p.getLastName(), p.getHogwartsID());
                if (!apprentices.contains(apprentice))
                    apprentices.add(apprentice);
            }
        }
        else if (p instanceof Professor)
        {
            if (professor == p)
                System.out.println(p.getName() + " hogwartsID:" + p.getHogwartsID() + " already attends/holds the lecture.");
            else if (professor != null)
                System.out.println("This lecture already has a professor!");
            else
                professor = (Professor) p;
        }
        else
            System.out.println("No such participants allowed in this lecture.");
    }

    public void addParticipants(List<Participant> participants) {
        for (Participant p : participants)
            addParticipant(p);
    }

    public void takePlace() {
        lectureHall.placeApprentices(apprentices);
        professor.openLecture(this);
        professor.closeLecture(this);
        lectureHall.empty();
    }
}
