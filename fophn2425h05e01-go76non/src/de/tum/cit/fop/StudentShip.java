package de.tum.cit.fop;

import java.util.List;

/**
 * This class represents a StudentShip which is a type of ContainerShip.
 * It contains a list of students and provides methods to manage these students.
 */
public class StudentShip extends ContainerShip {
    private List<Student> students;

    /**
     * Constructs a new StudentShip with the given capacity, ship type, and list of students.
     *
     * @param capacity the capacity of the ship
     * @param students the list of students on the ship
     */
    public StudentShip(int capacity, List<Student> students) {
        super(capacity, ShipType.STUDENT);
        this.students = students;
    }

    /**
     * Removes a student from the ship.
     *
     * @param student the student to be removed
     * @throws StudentNotFoundException if the student is not found on the ship
     */
    public void throwStudentOut(Student student) throws Exception {
        if (students.contains(student)) {
            students.remove(student);
        }
        else
            throw new StudentNotFoundException();
    }

    /**
     * Allows a student to role-play depending on the student type
     *
     * @param student the student who is role-playing
     * @throws StudentTypeNotFound if the student type is not recognized
     */
    // Note: this method only covers the BusinessStudent and ComputerScienceStudent student types.
    // Every other student type should throw a StudentTypeNotFound exception.
    public void rolePlay(Student student) throws StudentTypeNotFound {
        if (student instanceof BusinessStudent) {
            ((BusinessStudent) student).doBusiness();
        }
        else if (student instanceof ComputerScienceStudent) {
            ((ComputerScienceStudent) student).takeShower();
        }
        else
            throw new StudentTypeNotFound();
    }

}
