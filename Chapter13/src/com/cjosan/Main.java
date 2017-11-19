package com.cjosan;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Exercise 13.01

//        System.out.println("Enter triangle's sides");
//        double side1 = input.nextDouble();
//        double side2 = input.nextDouble();
//        double side3 = input.nextDouble();
//        input.nextLine();
//        System.out.println("Enter the color of triangle: ");
//        String color = input.nextLine();
//
//        System.out.println("Is the triangle filled: ");
//        boolean isFilled = input.nextBoolean();
//
//        if (Triangle.isValidTriangle(side1, side2, side3)) {
//            Triangle triangle = new Triangle(color, isFilled, side1, side2, side3);
//            System.out.println(triangle);
//        } else {
//            System.out.println("Cannot form a triangle with these sides dimensions");
//        }

        // Exercise 13.02

//        ArrayList<Number> list = new ArrayList<>();
//        for (int i = 0; i < 20; i++) {
//            list.add(i);
//        }
//        printList(list);
//        shuffle(list);
//        printList(list);

        // Exercise 13.03

//        ArrayList<Number> list = new ArrayList<>();
//        for (int i = 20; i > 0; i--) {
//            list.add(i);
//        }
//        printList(list);
//        sort(list);
//        printList(list);

        // Exercise 13.04
        // can run with parameters:
        // java Main year month
        // java Main year

//        MyCalendar calendar;
//
//        if (args.length == 2) {
//            calendar = new MyCalendar(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
//        } else if (args.length == 1) {
//            calendar = new MyCalendar(Integer.parseInt(args[0]));
//        } else {
//            calendar = new MyCalendar();
//        }
//        calendar.printMonth();

        // Exercise 13.05, 13.06

//        System.out.println(GeometricObject.max(new Circle(10, "white", true),
//                new Circle(15, "red", false)));
//        System.out.println(GeometricObject.max(new Rectangle(10, 10, "black", true),
//                new Rectangle(15, 15, "brown", false)));

        // Exercise 13.07

//        GeometricObject[] objects = new GeometricObject[5];
//        objects[0] = new Circle(10);
//        objects[1] = new Rectangle(10, 10);
//        objects[2] = new Triangle("red", true, 4, 5, 6);
//        objects[3] = new Square(14);
//        objects[4] = new Square(20);
//
//        for (GeometricObject object : objects) {
//            System.out.print(object.getArea() + "\t");
//            if (object instanceof Colorable) {
//                ((Colorable) object).howToColor();
//            } else
//                System.out.println();
//        }

        // Exercise 13.11

//        Octagon octagon = new Octagon(5);
//        System.out.println(octagon.getArea());
//        System.out.println(octagon.getPerimeter());
//
//        Octagon octagon1 = null;
//        try {
//            octagon1 = (Octagon)octagon.clone();
//        } catch (CloneNotSupportedException ex) {
//            System.out.println("Cannot create clone");
//        }
//
//        System.out.println(octagon1.getArea());
//        System.out.println(octagon1.getPerimeter());
//
//        System.out.println(octagon.compareTo(octagon1));

        // Exercise 13.12

//        GeometricObject[] objects = new GeometricObject[4];
//        objects[0] = new Circle(5);
//        objects[1] = new Circle(10);
//        objects[2] = new Rectangle(5, 5);
//        objects[3] = new Rectangle(10, 10);
//
//        System.out.println(GeometricObject.sumArea(objects));

        // Exercise 13.17

//        System.out.print("Enter first complex number: ");
//        Complex complex1 = new Complex(input.nextDouble(), input.nextDouble());
//
//        System.out.print("Enter first complex number: ");
//        Complex complex2 = new Complex(input.nextDouble(), input.nextDouble());
//
//        System.out.println(complex1.add(complex2));
//        System.out.println(complex1.subtract(complex2));
//        System.out.println(complex1.multiply(complex2));
//        System.out.println(complex1.divide(complex2));
//        System.out.println(complex1.abs());

        // Exercise 13.18

//        MyNewRational rational = new MyNewRational();
//
//        for (int i = 1; i < 100; i++) {
//            rational = rational.add(new MyNewRational(i, i + 1));
//            System.out.println(rational);
//        }
//
//        System.out.println(rational);

        // Exercise 13.19

//        System.out.print("Enter a decimal number: ");
//        String decimal = input.nextLine();
//        String[] number =  decimal.split("\\.");
//        long numerator = (long)(Double.parseDouble(decimal) * (long)Math.pow(10, number[1].length()));
//        long denominator = 1 * (long)Math.pow(10, number[1].length());
//
//        long gcd = MyNewRational.gcd(numerator, denominator);
//        MyNewRational rational = new MyNewRational(numerator/gcd, denominator/ gcd);
//        System.out.println("The fraction number is: " + rational);

        // Exercise 13.20

//        System.out.println("Enter a, b and c");
//        double a = input.nextDouble();
//        double b = input.nextDouble();
//        double c = input.nextDouble();
//        QuadraticEquation equation = new QuadraticEquation(a, b, c);
//        System.out.println(equation.getRoots());

        // Exercise 13.21

//        System.out.println("Enter a, b and c");
//        double a = input.nextDouble();
//        double b = input.nextDouble();
//        double c = input.nextDouble();
//        QuadraticEquation equation = new QuadraticEquation(a, b, c);
//        System.out.println("h is " + equation.getH() + "\tk is " + equation.getK());

    }

    public static void shuffle(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            int index = (int) (Math.random() * list.size());
            Number temp = list.get(index);
            list.set(index, list.get(i));
            list.set(i, temp);
        }
    }

    public static void sort(ArrayList<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            Number min = list.get(i);
            int index = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (min.doubleValue() > list.get(j).doubleValue()) {
                    index = j;
                    min = list.get(j);
                }
            }

            if (index != i) {
                Number temp = list.get(i);
                list.set(i, min);
                list.set(index, temp);
            }
        }
    }

    public static void printList(ArrayList list) {
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
