package de.tum.cit.fop;

public class PhysicalCalculator {
    private int storedValue;

    public PhysicalCalculator() {
        this.storedValue = 0;
    }

    public int getStoredValue() {
        return storedValue;
    }

    public void setStoredValue(int storedValue) {
        this.storedValue = storedValue;
    }

    @Override
    public String toString() {
        return "PhysicalCalculator{" + "storedValue='" + storedValue + "\'" + "}";
    }

    public void showResult() {
        System.out.println("Result: " + storedValue);
    }

    public void add(int newValue) {
        storedValue += newValue;
        showResult();
    }

    public void subtract(int newValue) {
        storedValue -= newValue;
        showResult();
    }
}
