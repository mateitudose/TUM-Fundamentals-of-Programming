package de.tum.cit.fop;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public String makeSound() {
        return "Woof woof";
    }

    public String fetch() {
        return "The dog can fetch a ball with great speed!";
    }

}
