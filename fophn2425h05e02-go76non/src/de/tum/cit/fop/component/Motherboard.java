package de.tum.cit.fop.component;

/**
 * @param model                  Represents the model of the MotherBoard.
 * @param supportedCPUSocket     Represents the supported CPU socket i.e. PGA.
 * @param supportedRAMTechnology Represents the supported RAM i.e. DRAM.
 * @param supportedGPUInterface  Represents the supported GPU Interface i.e. PCIe.
 * @param powerConsumption       Represents the power consumption of the MotherBoard.
 * @param price                  Represents the price of the MotherBoard.
 */
public record Motherboard(String model, String supportedCPUSocket, String supportedRAMTechnology,
                          String supportedGPUInterface, int powerConsumption, double price) {
}
