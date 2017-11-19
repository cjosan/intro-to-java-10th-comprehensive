package com.cjosan;

import java.math.BigInteger;

public class MyNewRational extends Number implements Comparable<MyNewRational> {
    private BigInteger numerator;
    private BigInteger denominator;

    public MyNewRational() {
        this(0, 1);
    }

    public MyNewRational(long numerator, long denominator) {
        this.numerator = new BigInteger(String.valueOf(numerator));
        this.denominator = new BigInteger(String.valueOf(denominator));
    }

    public static long gcd(long n, long d) {
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;

        for (int k = 1; k <= n1 && k <= n2; k++) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
        }

        return gcd;
    }

    public long getNumerator() {
        return numerator.longValue();
    }

    public long getDenominator() {
        return denominator.longValue();
    }



    public MyNewRational add(MyNewRational secondRational) {
        long n = numerator.multiply(new BigInteger(String.valueOf(secondRational.getDenominator())))
                .add(denominator.multiply(new BigInteger(String.valueOf(secondRational.getNumerator())))).longValue();
        long d = denominator.multiply(new BigInteger(String.valueOf(secondRational.getDenominator()))).longValue();
        return new MyNewRational(n, d);
    }

    /**
     * Subtract a rational number from this rational
     */
    public MyNewRational subtract(MyNewRational secondRational) {
        long n = numerator.multiply(new BigInteger(String.valueOf(secondRational.getDenominator())))
                .subtract(denominator.multiply(new BigInteger(String.valueOf(secondRational.getNumerator())))).longValue();
        long d = denominator.multiply(new BigInteger(String.valueOf(secondRational.getDenominator()))).longValue();
        return new MyNewRational(n, d);
    }

    /**
     * Multiply a rational number by this rational
     */
    public MyNewRational multiply(MyNewRational secondRational) {
        long n = numerator.multiply(new BigInteger(String.valueOf(secondRational.getNumerator()))).longValue();
        long d = denominator.multiply(new BigInteger(String.valueOf(secondRational.getDenominator()))).longValue();
        return new MyNewRational(n, d);
    }

    /**
     * Divide a rational number by this rational
     */
    public MyNewRational divide(MyNewRational secondRational) {
        long n = numerator.multiply(new BigInteger(String.valueOf(secondRational.getDenominator()))).longValue();
        long d = denominator.multiply(new BigInteger(String.valueOf(secondRational.numerator))).longValue();
        return new MyNewRational(n, d);
    }

    @Override
    public String toString() {
        if (denominator.equals(1))
            return numerator + "";
        else
            return numerator + "/" + denominator;
    }

    @Override // Override the equals method in the Object class
    public boolean equals(Object other) {
        if ((this.subtract((MyNewRational) (other))).getNumerator() == 0)
            return true;
        else
            return false;
    }

    @Override // Implement the abstract intValue method in Number
    public int intValue() {
        return (int) doubleValue();
    }

    @Override // Implement the abstract floatValue method in Number
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override // Implement the doubleValue method in Number
    public double doubleValue() {
        return numerator.multiply(BigInteger.ONE).divide(denominator).doubleValue();
    }

    @Override // Implement the abstract longValue method in Number
    public long longValue() {
        return (long) doubleValue();
    }

    @Override // Implement the compareTo method in Comparable
    public int compareTo(MyNewRational o) {
        if (this.subtract(o).getNumerator() > 0)
            return 1;
        else if (this.subtract(o).getNumerator() < 0)
            return -1;
        else
            return 0;
    }
}
