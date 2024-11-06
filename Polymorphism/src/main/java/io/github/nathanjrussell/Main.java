package io.github.nathanjrussell;

import io.github.nathanjrussell.shape.Shape;
import io.github.nathanjrussell.vehicle.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Shape[] shapes = new Shape[2];
        shapes[0] = new io.github.nathanjrussell.shape.RegularPolygon(4, 5);
        shapes[1] = new io.github.nathanjrussell.shape.Ellipse(3, 2);

        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
        }

        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new io.github.nathanjrussell.vehicle.combustion.GasVehicle("1G1YZ23J9P5800001", "Chevrolet", "Corvette", 1993, 8, "Gasoline");
        vehicles[1] = new io.github.nathanjrussell.vehicle.electric.ElectricVehicle("1G1YZ23J9P5800002", "Tesla", "Model S", 2012, 85, 300);

        for (Vehicle vehicle : vehicles) {
            System.out.println("VIN: " + vehicle.getVin());
            System.out.println("Make: " + vehicle.getMake());
            System.out.println("Model: " + vehicle.getModel());
            System.out.println("Year: " + vehicle.getYear());
            }
    }
}