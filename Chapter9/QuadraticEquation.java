package com.company;

/**
 * Created by admin on 16.06.2017.
 */
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0)
            return (-b + Math.sqrt(discriminant)) / (2 * a);
        else
            return 0;
    }

    public double getRoot2() {
        double discriminant = getDiscriminant();
        if (discriminant >= 0)
            return (-b - Math.sqrt(discriminant)) / (2 * a);
        else
            return 0;
    }
}
