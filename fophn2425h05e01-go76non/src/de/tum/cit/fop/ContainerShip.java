package de.tum.cit.fop;

public class ContainerShip<T> {

    protected int capacity;
    protected ShipType shipType;
    public ContainerShip(int capacity, ShipType shipType) {
        this.capacity = capacity;
        this.shipType = shipType;
    }
}
