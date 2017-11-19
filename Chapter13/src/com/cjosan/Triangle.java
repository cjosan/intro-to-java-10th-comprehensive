package com.cjosan;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        double area = Math.sqrt(p * (p * (p - this.side1) * (this.side2 * this.side3)));

        return area;
    }

    @Override
    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public static boolean isValidTriangle(double side1, double side2, double side3) {
        return side1 + side2 > side3 &&
                side2 + side3 > side1 &&
                side1 + side3 > side2;
    }

    @Override
    public String toString() {
        return "Triangle with perimeter " + String.format("%.2f", this.getPerimeter())
                + " and area " + String.format("%.2f", this.getArea())
                + "\ncreated on " + super.getDateCreated()
                + "\nColor: " + super.getColor()
                + "\tFilled: " + super.isFilled();
    }

    @Override
    public int compareTo(GeometricObject triangle) {
        if (getArea() > triangle.getArea()) {
            return 1;
        } else if (getArea() < triangle.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}
