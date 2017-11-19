package com.cjosan;

/**
 * Created by admin on 18.06.2017.
 */
public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return isEven(this.value);
    }

    public boolean isOdd() {
        return isOdd(this.value);
    }

    public boolean isPrime() {
        return isPrime(this.value);
    }

    public static boolean isEven(int value) {
        return (value % 2 == 0);
    }

    public static boolean isOdd(int value) {
        return (value % 2 != 0);
    }

    public static boolean isPrime(int value) {
        for (int i = 2; i <= Math.round(value / 2); i++) {
            if (value % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger value) {
        return value.isEven();
    }

    public static boolean isOdd(MyInteger value) {
        return value.isOdd();
    }

    public static boolean isPrime(MyInteger value) {
        return value.isPrime();
    }

    public boolean equals(int value) {
        return (this.value == value);
    }

    public boolean equals(MyInteger value) {
        return (this.value == value.value);
    }

    public int parseInt(char[] integers) {
        String str = String.valueOf(integers);
        return Integer.parseInt(str);
    }

    public int parseInt(String s) {
        return Integer.valueOf(s);
    }
}