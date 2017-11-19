package com.cjosan;

public class MyRational extends Number implements Comparable<MyRational> {
    private long[] r = new long[2];

    public MyRational() {
        this(0 ,1);
    }

    public MyRational(long numerator, long denominator) {
        this.r[0] = numerator;
        this.r[1] = denominator;
    }

    private static long gcd(long n, long d) {
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
        return r[0];
    }

    public long getDenominator() {
        return r[1];
    }

    /**
     * Add a rational number to this rational
     */
    public MyRational add(MyRational secondRational) {
        long n = r[0] * secondRational.getDenominator() +
                r[1] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new MyRational(n, d);
    }

    /**
     * Subtract a rational number from this rational
     */
    public MyRational subtract(MyRational secondRational) {
        long n = r[0] * secondRational.getDenominator()
                - r[1] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new MyRational(n, d);
    }

    /**
     * Multiply a rational number by this rational
     */
    public MyRational multiply(MyRational secondRational) {
        long n = r[0] * secondRational.getNumerator();
        long d = r[1] * secondRational.getDenominator();
        return new MyRational(n, d);
    }

    /**
     * Divide a rational number by this rational
     */
    public MyRational divide(MyRational secondRational) {
        long n = r[0] * secondRational.getDenominator();
        long d = r[1] * secondRational.r[0];
        return new MyRational(n, d);
    }

    @Override
    public String toString() {
        if (r[1] == 1)
            return r[0] + "";
        else
            return r[0] + "/" + r[1];
    }

    @Override // Override the equals method in the Object class
    public boolean equals(Object other) {
        if ((this.subtract((MyRational) (other))).getNumerator() == 0)
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
        return r[0] * 1.0 / r[1];
    }

    @Override // Implement the abstract longValue method in Number
    public long longValue() {
        return (long) doubleValue();
    }

    @Override // Implement the compareTo method in Comparable
    public int compareTo(MyRational o) {
        if (this.subtract(o).getNumerator() > 0)
            return 1;
        else if (this.subtract(o).getNumerator() < 0)
            return -1;
        else
            return 0;
    }
}
