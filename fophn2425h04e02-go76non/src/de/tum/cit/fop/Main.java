package de.tum.cit.fop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Setup lecture environment
        Professor professor = new Professor("Albus", "Dumbledore", "p001", "Dr.");
        LectureHall lectureHall = new LectureHall("Great Hall",100);
        Lecture lecture = new Lecture("L001", "Defense Against the Dark Arts", professor, lectureHall);


        // Create participants
        Apprentice apprentice1 = new Apprentice("Harry", "Potter", "a001");
        Apprentice apprentice2 = new Apprentice("Hermione", "Granger", "a002");

        WizardAide wizardAide1 = new WizardAide("Draco", "Malfoy", "w001", lecture);
        WizardAide wizardAide2 = new WizardAide("Luna", "Lovegood", "w002",lecture);

        QuidditchTrainer trainer1 = new QuidditchTrainer("Oliver", "Wood", "q001",lecture);
        QuidditchTrainer trainer2 = new QuidditchTrainer("Victor", "Krum", "q002",lecture);

        lecture.setWizardAides(new ArrayList<>(List.of(wizardAide1)));

        // Adding valid participants
        lecture.addParticipant(apprentice1); // Should add apprentice1
        lecture.addParticipant(apprentice2); // Should add apprentice2
        lecture.addParticipant(wizardAide1); // Should add wizardAide1 and apprentice equivalent
        lecture.addParticipant(trainer1);   // Should add trainer1 and apprentice equivalent

        // Attempting duplicates
        lecture.addParticipant(apprentice1); // Duplicate apprentice1
        lecture.addParticipant(wizardAide1); // Duplicate wizardAide1
        lecture.addParticipant(trainer1);    // Duplicate trainer1

        // Adding new WizardAide and QuidditchTrainer
        lecture.addParticipant(wizardAide2); // Should add wizardAide2 and apprentice equivalent
        lecture.addParticipant(trainer2);    // Should add trainer2 and apprentice equivalent

        // Edge cases
        lecture.addParticipant(professor);   // Professor already holds the lecture

        // Print out results
        System.out.println("\n--- Final Lecture Participants ---");
        System.out.println("Apprentices: " + lecture.getApprentices().size());
        lecture.getApprentices().forEach(a -> System.out.println(a.getName() + " (ID: " + a.getHogwartsID() + ")"));

        System.out.println("\nWizardAides: " + lecture.getWizardAides().size());
        lecture.getWizardAides().forEach(w -> System.out.println(w.getName() + " (ID: " + w.getHogwartsID() + ")"));

        System.out.println("\nQuidditchTrainers: " + lecture.getQuidditchTrainers().size());
        lecture.getQuidditchTrainers().forEach(q -> System.out.println(q.getName() + " (ID: " + q.getHogwartsID() + ")"));

        System.out.println("\nProfessor: " + lecture.getProfessor().getName() + " (ID: " + lecture.getProfessor().getHogwartsID() + ")");
    }
}
