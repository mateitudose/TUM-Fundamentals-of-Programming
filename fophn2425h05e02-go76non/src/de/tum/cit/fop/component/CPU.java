package de.tum.cit.fop.component;

/**
 * @param model            Represents the model of the CPU.
 * @param socket           Represents the socket type of the CPU.
 * @param powerConsumption Represents the power consumption of the CPU.
 * @param price            Represents the price of the CPU.
 */
public record CPU(String model, String socket, int powerConsumption, double price) {
}
