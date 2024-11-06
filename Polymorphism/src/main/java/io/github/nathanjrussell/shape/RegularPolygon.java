package io.github.nathanjrussell.shape;

public class RegularPolygon implements Shape{
    private final int numSides;
    private final double sideLength;

    public RegularPolygon(int numSides, double sideLength) {
        this.numSides = numSides;
        this.sideLength = sideLength;
    }

    public int getNumSides() {
        return numSides;
    }

    public double getSideLength() {
        return sideLength;
    }

    public double getArea() {
        return (numSides * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / numSides));
    }

    public double getPerimeter() {
        return numSides * sideLength;
    }
}
