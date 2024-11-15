package de.tum.cit.fop;

import java.util.List;

public class LectureHall {
    private String name;
    private int capacity;
    private int rows;
    private Apprentice[][] rowsOfApprentices;

    public LectureHall(String name, int capacity) {
        this.name = name;
        this.capacity = Math.max(90, capacity);
        this.capacity = (this.capacity / 30) * 30;
        this.rows = this.capacity / 30;
        this.rowsOfApprentices = new Apprentice[rows][30];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public Apprentice[][] getRowsOfApprentices() {
        return rowsOfApprentices;
    }

    public void setRowsOfApprentices(Apprentice[][] rowsOfApprentices) {
        this.rowsOfApprentices = rowsOfApprentices;
    }

    public void placeApprentices(List<Apprentice> waitingApprentices) {
        System.out.println("Waiting apprentices: " + waitingApprentices.size());
        if (waitingApprentices.size() > capacity) {
            System.out.println(name + " hall doesn't have enough places for all the apprentices!\n" +
                    "We can place only the first " + capacity + " out of " + waitingApprentices.size() + " apprentices.");
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 30; j++) {
                if (rowsOfApprentices[i][j] == null) {
                    rowsOfApprentices[i][j] = waitingApprentices.get(0);
                    waitingApprentices.remove(0);
                }
            }
        }
        if (waitingApprentices.isEmpty())
            System.out.println("All apprentices are sitting in the lecture hall.");
        System.out.println(this);
    }

    public void empty() {
        if (rowsOfApprentices == null) {
            return;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 30; j++) {
                rowsOfApprentices[i][j] = null;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" hall:\n");
        for (int i = 0; i < rows; i++) {
            sb.append("Row ").append(i + 1).append(": ");
            for (int j = 0; j < 30; j++) {
                if (rowsOfApprentices[i][j] == null) {
                    sb.append("[]");
                } else {
                    sb.append("[").append(rowsOfApprentices[i][j].getName()).append("]");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
