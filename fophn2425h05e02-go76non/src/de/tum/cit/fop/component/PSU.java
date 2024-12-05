package de.tum.cit.fop.component;

import java.util.List;

/**
 * @param model          Represents the model of the PSU.
 * @param wattage        Represents the wattage.
 * @param connectorTypes Represents the connectorTypes that the PSU provides power.
 * @param price          Represents the price of the PSU.
 */
public record PSU(String model, int wattage, List<String> connectorTypes, double price) {
}
