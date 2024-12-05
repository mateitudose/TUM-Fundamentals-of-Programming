package de.tum.cit.fop;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a CargoShip that can carry containers of a specific type.
 * It extends the Container class.
 *
 * @param <T> the type of the content that the containers of this ship can carry
 */
public class CargoShip<T> extends ContainerShip<T> {
    private List<Container<T>> containers;

    /**
     * Constructor for the CargoShip class.
     * CargoShips always have a capacity of 100 containers and are of type CARGO.
     * Initializes the containers list.
     */
    public CargoShip() {
        super(100, ShipType.CARGO);
        this.containers = new ArrayList<>(100);
    }

    /**
     * This method is used to load a container onto the ship.
     * It checks if the ship is empty or if the passed container's content type matches the type of the containers already on the ship.
     * If the check passes, the container is added to the ship.
     * If the check fails, an IllegalArgumentException is thrown.
     *
     * @param container the container to be loaded onto the ship
     * @throws IllegalArgumentException if the container's content type does not match the type of the containers already on the ship
     */
    public void load(Container<T> container) {
        if (containers.isEmpty() || container.getContent().getClass().equals(containers.get(0).getContent().getClass()))
            containers.add(container);
        else
            throw new IllegalArgumentException();
    }

    /**
     * This method is used to unload a container from the ship.
     * It checks if the ship is empty.
     * If the ship is not empty, the last container that was loaded onto the ship is removed and returned.
     * If the ship is empty, an IllegalStateException is thrown.
     *
     * @return the container that was unloaded from the ship
     * @throws IllegalStateException if the ship is empty
     */
    public Container<T> unload() {
        if (containers.isEmpty())
            throw new IllegalStateException();
        Container<T> container = containers.get(containers.size() - 1);
        if (container == null)
            throw new IllegalStateException();
        containers.remove(container);
        return container;
    }
}
