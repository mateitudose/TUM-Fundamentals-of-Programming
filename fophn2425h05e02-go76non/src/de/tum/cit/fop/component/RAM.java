package de.tum.cit.fop.component;

/**
 * @param model            Represents the model of the RAM.
 * @param technology       Represents the RAM's technology type.
 * @param amountOfMemory   Represents the memory size of the RAM.
 * @param powerConsumption Represents the power consumption of the RAM.
 * @param price            Represents the price of the RAM.
 */
public record RAM(String model, String technology, int amountOfMemory, int powerConsumption, double price) {
}
