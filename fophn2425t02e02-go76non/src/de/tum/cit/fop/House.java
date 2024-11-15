package de.tum.cit.fop;

import java.util.Arrays;

public class House {
    private String[] obstacles;
    private int peopleInHouse;

    public House(String[] obstacles, int peopleInHouse) {
        this.obstacles = obstacles;
        this.peopleInHouse = peopleInHouse;
    }

    public String[] getObstacles() {
        return obstacles;
    }

    public void setObstacles(String[] obstacles) {
        this.obstacles = obstacles;
    }

    public int getPeopleInHouse() {
        return peopleInHouse;
    }

    public void setPeopleInHouse(int peopleInHouse) {
        this.peopleInHouse = peopleInHouse;
    }

    @Override
    public String toString() {
        return "House{" +
                "obstacles=" + Arrays.toString(obstacles) +
                ", peopleInHouse=" + peopleInHouse +
                '}';
    }
}
