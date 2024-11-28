package de.tum.cit.fop;

public class Main {
    public static void main(String[] args) {
        // Create three packages with content of type String, Integer and Double
        Package<String> stringPackage = PinguzonWarehouse.packPackage("Hello, Pingu!");
        Package<Integer> integerPackage = PinguzonWarehouse.packPackage(42);
        Package<Double> doublePackage = PinguzonWarehouse.packPackage(3.14);

        // Unpack the packages and get the contents
        String unpackedString = PinguzonWarehouse.unpackPackage(stringPackage);
        Integer unpackedInteger = PinguzonWarehouse.unpackPackage(integerPackage);
        Double unpackedDouble = PinguzonWarehouse.unpackPackage(doublePackage);

        // Let's see what we get back
        System.out.println("Received content from the stringPackage: " + unpackedString);
        System.out.println("Received content from the integerPackage: " + unpackedInteger);
        System.out.println("Received content from the doublePackage: " + unpackedDouble);
    }
}
