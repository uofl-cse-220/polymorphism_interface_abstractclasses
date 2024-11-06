package io.github.nathanjrussell.vehicle;

public abstract class Vehicle {
    private final String vin;
    private final String make;
    private final String model;
    private final int year;

    public Vehicle(String vin, String make, String model, int year) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getVin() {
        return vin;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
