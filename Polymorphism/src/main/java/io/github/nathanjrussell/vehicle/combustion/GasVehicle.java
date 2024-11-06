package io.github.nathanjrussell.vehicle.combustion;

import io.github.nathanjrussell.vehicle.Vehicle;

public class GasVehicle  extends Vehicle {
    private final int numCylinders;
    private final String fuelType;

    public GasVehicle(String vin, String make, String model, int year, int numCylinders, String fuelType) {
        super(vin, make, model, year);
        this.numCylinders = numCylinders;
        this.fuelType = fuelType;
    }

    public int getNumCylinders() {
        return numCylinders;
    }

    public String getFuelType() {
        return fuelType;
    }

}
