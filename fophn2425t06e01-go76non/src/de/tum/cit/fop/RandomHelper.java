package de.tum.cit.fop;

import java.util.Random;

public class RandomHelper {
    public static String generateRandomID() {
        // Define the characters allowed in the random ID
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        // Create a StringBuilder to store the generated ID
        StringBuilder randomID = new StringBuilder();

        // Create an instance of Random class
        Random random = new Random();

        // Generate the random ID of length 8
        for (int i = 0; i < 8; i++) {
            // Get a random index from the characters string
            int randomIndex = random.nextInt(characters.length());

            // Append the randomly selected character to the ID
            randomID.append(characters.charAt(randomIndex));
        }

        // Convert StringBuilder to String and return the random ID
        return randomID.toString();
    }
}
