package de.tum.cit.fop;

import de.tum.cit.fop.component.*;
import de.tum.cit.fop.exception.*;

/**
 * @param motherboard Represents the MotherBoard component.
 * @param cpu         Represents the CPU component.
 * @param gpu         Represents the GPU component.
 * @param psu         Represents the PSU component.
 * @param ram         Represents the RAM component.
 */
public record PC(Motherboard motherboard, CPU cpu, GPU gpu, PSU psu, RAM ram) {
    public PC {
        if (cpu == null)
            throw new MissingCPUException();
        if (gpu == null)
            throw new MissingGPUException();
        if (ram == null)
            throw new MissingRAMException();
    }

    public double calculateTotalPrice() {
        return cpu.price() + gpu.price() + ram.price() + psu.price() + motherboard().price();
    }

    private boolean isPSUCompatibleWithGPU() {
        return psu.connectorTypes().contains(gpu.connectorType());
    }

    private boolean isRAMCompatibleWithMotherboard() {
        return motherboard.supportedRAMTechnology().equals(ram.technology());
    }

    private boolean isGPUCompatibleWithMotherboard() {
        return motherboard.supportedGPUInterface().equals(gpu.requiredMotherboardInterface());
    }

    private boolean isCPUCompatibleWithMotherboard() {
        return motherboard.supportedCPUSocket().equals(cpu.socket());
    }

    private boolean isEnoughPower() {
        return motherboard.powerConsumption() + cpu().powerConsumption() + gpu.powerConsumption() + ram.powerConsumption() <= psu.wattage();
    }

    private String boot() {
        if (!isEnoughPower()) throw new NotEnoughPowerException();
        if (!isPSUCompatibleWithGPU())
            throw new MissingConnectorException("Connector type not found, the supported PSU connector types are: " + psu.connectorTypes() + "\nBut GPU connector type is: " + gpu.connectorType());
        if (!isRAMCompatibleWithMotherboard())
            throw new UnsupportedDeviceException("Detected incompatible devices, the supported RAM technology is: " + motherboard.supportedRAMTechnology() + "\nBut actual is: " + ram.technology());
        if (!isGPUCompatibleWithMotherboard())
            throw new UnsupportedDeviceException("Detected incompatible devices, the supported GPU interface is: " + motherboard.supportedGPUInterface() + "\nBut actual is: " + gpu.requiredMotherboardInterface());
        if (!isCPUCompatibleWithMotherboard())
            throw new UnsupportedDeviceException("Detected incompatible devices, the supported CPU socket is: " + motherboard.supportedCPUSocket() + "\nBut actual is: " + cpu.socket());
        return "SUCCESS";
    }

    public void start() {
        try {
            boot();
            System.out.println("Boot status: SUCCESS");
            System.out.println("The computer started successfully.");
        } catch (Exception e) {
            System.out.println("Boot status: FAILURE");
            System.out.println("Could not start the computer, because " + e.getClass().getSimpleName() + " was thrown.");
            System.out.println("Failure reason: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Use for testing.
    }
}
