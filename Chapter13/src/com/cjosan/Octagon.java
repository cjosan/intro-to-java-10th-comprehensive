package com.cjosan;

public class Octagon extends GeometricObject implements Cloneable{
    private double side;

    public Octagon(double side) {
        this.side = side;
    }

    public Octagon(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter() {
        return 8 * side;
    }

    @Override
    public int compareTo(GeometricObject octagon) {
        if (getArea() > octagon.getArea())
            return 1;
        else if (getArea() < octagon.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
