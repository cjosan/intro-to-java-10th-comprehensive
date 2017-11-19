package com.company;

/**
 * Created by admin on 16.06.2017.
 */
public class Rectangle {
    public double width;
    public double heigth;

    public Rectangle() {
        this(0,0);
    }

    public Rectangle(double width, double heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public double getArea() {
        return this.width * this.heigth;
    }

    public double getPerimeter() {
        return 2 * this.width + 2 * this.heigth;
    }

}
