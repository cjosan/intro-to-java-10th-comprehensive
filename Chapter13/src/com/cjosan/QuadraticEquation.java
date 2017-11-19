package com.cjosan;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private double getDeterminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public String getRoots() {
        double determinant = getDeterminant();

        if (determinant > 0) {
            double fRoot = (-b + Math.sqrt(determinant)) / 2 * a;
            double sRoot = (-b - Math.sqrt(determinant)) / 2 * a;
            return "First root is: " + fRoot + "\nSecond root is: " + sRoot;
        } else if (determinant == 0) {
            double root = (-b + Math.sqrt(determinant)) / 2 * a;
            return "The root is: " + root;
        } else {
            Complex root = new Complex(-b/2 * a, Math.sqrt(Math.abs(determinant))/2 * a);
            return "The roots are: " + root.getRealPart() + " + " + root.getImaginaryPart() +
                    "i and " + root.getRealPart() + " - " + root.getImaginaryPart() + "i";
        }
    }

    public double getH() {
        return -b / 2 * a;
    }

    public double getK() {
        double h = getH();
        return a * Math.pow(h, 2) + b * h + c;
    }
}
