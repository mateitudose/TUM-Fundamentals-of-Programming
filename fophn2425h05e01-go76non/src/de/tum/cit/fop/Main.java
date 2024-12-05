package de.tum.cit.fop;

public class Main {

    public static void main(String[] args) {
        // Part 1: Uncomment the following code block to test your implementation in Part 1
/*
        Container<String> stringContainer = new Container<>(5, "Goods");
        Container<Integer> integerContainer = new Container<>(3, 42);

        CargoShip<String> stringShip = new CargoShip<>();
        try {
            stringShip.load(stringContainer);
            // Uncommenting the line below will result in an error due to type mismatch
            // stringShip.load(integerContainer);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Container<String> unloadedContainer = stringShip.unload();
            System.out.println("Unloaded container with content: " + unloadedContainer.getContent());
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }
*/

        // Part 2: Uncomment the following code block to test your implementation in Part 2
/*
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Ansat", "12345");
        Student student2 = new Student("Boryana", "54321");
        Student student3 = new Student("Fabian", "67890");
        Student computerScienceStudent = new ComputerScienceStudent("John", "666");
        students.add(student1);
        students.add(student2);
        students.add(student3);

        StudentShip studentShip = new StudentShip(50, students);
        try {
            studentShip.throwStudentOut(student3);
        } catch (StudentNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            studentShip.rolePlay(computerScienceStudent);
        } catch (StudentTypeNotFound e) {
            throw new RuntimeException(e);
        }
*/
    }
}
