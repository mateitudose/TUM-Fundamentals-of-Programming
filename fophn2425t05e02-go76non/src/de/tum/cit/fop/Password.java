package de.tum.cit.fop;

import java.util.Scanner;

/**
 * Class with a simplified password security algorithm,
 * which gives feedback to the user with the help of Exceptions.
 */
public class Password {
    private String password;
    private int length;
    private boolean isStrong;
    private boolean upperCase;
    private boolean lowerCase;
    private boolean special;

    public Password(String password) {
        this.password = password;
        this.length = password.length();
        this.isStrong = false;
        this.lowerCase = false;
        this.upperCase = false;
        this.special = false;
    }

    public String getPassword() {
        return password;
    }

    public int getLength() {
        return length;
    }

    public boolean isStrong() {
        return isStrong;
    }

    public boolean isUpperCase() {
        return upperCase;
    }

    public boolean isLowerCase() {
        return lowerCase;
    }

    public boolean isSpecial() {
        return special;
    }

    public boolean checkStrength() {
        this.lowerCase = false;
        this.upperCase = false;
        this.special = false;
        if (checkForUpperCase(password)) this.upperCase = true;
        if (checkForLowerCase(password)) this.lowerCase = true;
        if (checkForSpecial(password)) this.special = true;
        return (upperCase && lowerCase && special);
    }

    public void strengthenPassword() throws Exception {
        checkStrength();
        if (!upperCase) throw new UpperCaseNotFoundException();
        if (!lowerCase) throw new LowerCaseNotFoundException();
        if (!special) throw new SpecialCharNotFoundException();
        System.out.println("Your Password: " + passwordHidden() + " is strong enough.");
        isStrong = true;
    }

    static public Password createStrongPassword() {
        System.out.println("Create a strong password, which contains at least:\n One uppercase letter,\n One lowercase letter and\n One of the following special characters: ~ ? ! @ # $");
        System.out.println("Password:");
        String pass = readLineFromConsole();
        Password generatedPass = new Password(pass);
        try {
            generatedPass.strengthenPassword();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (generatedPass.isStrong)
                System.out.println("Great job!");
            else
                System.out.println("Keep on trying.");
        }
        return generatedPass;
    }

    /**
     * Helper Method for printing in strengthenPassword()
     */
    public String passwordHidden() {
        return password.charAt(0) + "\u2022".repeat(Math.max(0, this.length - 1));
    }


    public static void main(String[] args) throws Exception {
        createStrongPassword();
    }

    //Helper methods

    /**
     * @param password
     * @return if the password contains a lowercase letter this method returns true else false
     */
    public static boolean checkForLowerCase(String password) {
        return password.matches("(?=.*[a-z]).*");
    }

    /**
     * @param password
     * @return if the password contains an uppercase letter this method returns true else false
     */
    public static boolean checkForUpperCase(String password) {
        return password.matches("(?=.*[A-Z]).*");
    }

    /**
     * @param password
     * @return if the password contains any spacial characters this method returns true else false
     */
    public static boolean checkForSpecial(String password) {
        return password.matches("(?=.*[+~?!@#$]).*");
    }

    /**
     * Reads a line from the console
     *
     * @return line
     */
    public static String readLineFromConsole() {
        return (new Scanner(System.in)).nextLine();
    }
}
