package com.cjosan;

public class Square extends GeometricObject implements Colorable{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public int compareTo(GeometricObject square) {
        if (getArea() > square.getArea())
            return 1;
        else if (getArea() < square.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
