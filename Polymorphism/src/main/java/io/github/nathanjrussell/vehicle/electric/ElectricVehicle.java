package io.github.nathanjrussell.vehicle.electric;

import io.github.nathanjrussell.vehicle.Vehicle;

public class ElectricVehicle extends Vehicle {
    private final int batteryCapacity;
    private final int rangeMiles;

    public ElectricVehicle(String vin, String make, String model, int year, int batteryCapacity, int range) {
        super(vin, make, model, year);
        this.batteryCapacity = batteryCapacity;
        this.rangeMiles = range;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getRange() {
        return rangeMiles;
    }
}
