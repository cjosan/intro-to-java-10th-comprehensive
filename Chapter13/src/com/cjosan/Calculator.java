package com.cjosan;

public class Calculator {
    /**
     * Main method
     */
    public static void main(String[] args) {
        // Check number of strings passed
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        // The result of the operation
        Rational result = null;

        String[] r = (args[0].split("/"));
        Rational firstRational = new Rational(Integer.parseInt(r[0]), Integer.parseInt(r[1]));

        r = (args[2].split("/"));
        Rational secondRational = new Rational(Integer.parseInt(r[0]), Integer.parseInt(r[1]));

        // Determine the operator
        switch (args[1].charAt(0)) {
            case '+':
                result = firstRational.add(secondRational);
                break;
            case '-':
                result = firstRational.subtract(secondRational);
                break;
            case '.':
                result = firstRational.multiply(secondRational);
                break;
            case '/':
                result = firstRational.divide(secondRational);
        }

        // Display result
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                + " = " + result);
    }
}
