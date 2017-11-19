package com.cjosan;

/**
 * Created by admin on 20.06.2017.
 */
public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D() {
        this(0, 0, 1, 1);
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

    public boolean contains(double x, double y) {
        return  (x < (this.x + (0.5 * this.width)) && x > (this.x - (0.5 * this.width)) &&
        y < (this.y + (0.5 * this.height)) && y > (this.y - (0.5 * this.height)));
    }

    public boolean contains(MyRectangle2D r) {
        return ((x >= r.getX()) && (y >= r.getY())
                && ((x + r.getWidth()) <= (r.getX() + width))
                && ((y + r.getHeight()) <= (y + height)));
    }

    public boolean overlaps(MyRectangle2D r) {
        return x < r.getX() + r.getWidth() && x + width > r.getX() && y < r.getY() + r.getHeight() && y + height > r.getY();
    }
}
