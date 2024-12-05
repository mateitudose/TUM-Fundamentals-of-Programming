package de.tum.cit.fop.component;

import de.tum.cit.fop.exception.MissingRAMException;

/**
 * @param model                        Represents the model of the GPU.
 * @param requiredMotherboardInterface Represents the supported GPU interface of the MotherBoard.
 * @param ram                          Represents the associated RAM of the GPU.
 * @param connectorType                Represents the required power.
 * @param powerConsumption             Represents the power consumption of the GPU.
 * @param price                        Represents the price of the GPU.
 */
public record GPU(String model, String requiredMotherboardInterface, RAM ram, String connectorType,
                  int powerConsumption, double price) {
    public GPU {
        if (ram == null)
            throw new MissingRAMException();
    }

    @Override
    public double price() {
        return price + ram.price();
    }
}
