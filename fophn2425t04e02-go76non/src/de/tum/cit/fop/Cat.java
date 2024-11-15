package de.tum.cit.fop;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Miau";
    }

    public String climb() {
        return "The cat can climb trees effortlessly!";
    }
}
