package com.cjosan;

public class Complex implements Cloneable{
    private double real;
    private double imaginary;

    public Complex() {
        this(0, 0);
    }

    public Complex(double real) {
        this(real, 0);
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getRealPart() {
        return real;
    }

    public double getImaginaryPart() {
        return imaginary;
    }

    public Complex add(Complex complex) {
        double r = real + complex.real;
        double i = imaginary + complex.imaginary;
        return new Complex(r, i);
    }

    public Complex subtract(Complex complex) {
        double r = real - complex.real;
        double i = imaginary - complex.imaginary;
        return new Complex(r, i);
    }

    public Complex multiply(Complex complex) {
        double r = (real * complex.real - imaginary * complex.imaginary);
        double i = (imaginary * complex.real + real * complex.imaginary);
        return new Complex(r, i);
    }

    public Complex divide(Complex complex) {
        double r = (real * complex.real + imaginary * complex.imaginary) /
                (Math.pow(complex.real, 2) + Math.pow(complex.imaginary, 2));
        double i = (imaginary * complex.real - real * complex.imaginary) /
                (Math.pow(complex.real, 2) + Math.pow(complex.imaginary, 2));
        return new Complex(r, i);
    }

    public double abs() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imaginary, 2));
    }

    @Override
    public String toString() {
        if (real == 0 && imaginary == 0) {
            return "0";
        } else if (imaginary == 0) {
            return String.valueOf(real);
        } else {
            return "(" + real + ", " + imaginary + "i)";
        }
    }
}
