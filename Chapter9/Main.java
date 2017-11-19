package com.company;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Exercise 9.01
//	      Rectangle rect1 = new Rectangle(4, 40);
//        Rectangle rect2 = new Rectangle(3.5, 35.9);
//        System.out.println(rect1.width);
//        System.out.println(rect1.heigth);
//        System.out.println(rect1.getArea());
//        System.out.println(rect1.getPerimeter());
//        System.out.println(rect2.width);
//        System.out.println(rect2.heigth);
//        System.out.println(rect2.getArea());
//        System.out.println(rect2.getPerimeter());

        // Exercise 9.02

//        Stock st = new Stock("ORCL", "Oracle Corporation");
//        st.previousClosingPrice = 34.5;
//        st.currentPrice = 34.35;
//        System.out.println("The change percent is " + st.getChangePercent());

        // Exercise 9.03

//        Date date = new Date();
//        long time = 10000;
//
//        for (int i = 0; i < 8; i++) {
//            date.setTime(time);
//            System.out.println("The time is: " + date.toString());
//            time *= 10;
//        }

        // Exercise 9.04

//        Random random = new Random(1000);
//
//        for (int i = 0; i < 50; i++) {
//            System.out.println(random.nextInt(100));
//        }

        // Exercise 9.05

//        GregorianCalendar calendar = new GregorianCalendar();
//        System.out.print(calendar.get(GregorianCalendar.YEAR) + " ");
//        System.out.print(calendar.get(GregorianCalendar.MONTH) + " ");
//        System.out.println(calendar.get(GregorianCalendar.DAY_OF_MONTH));
//
//        calendar.setTimeInMillis(1234567898765L);
//        System.out.print(calendar.get(GregorianCalendar.YEAR) + " ");
//        System.out.print(calendar.get(GregorianCalendar.MONTH) + " ");
//        System.out.println(calendar.get(GregorianCalendar.DAY_OF_MONTH));

        // Exercise 9.06

//        Random random = new Random();
//        StopWatch watch = new StopWatch();
//        int[] list = new int[100000];
//
//        for (int i = 0; i < list.length; i++) {
//            list[i] = random.nextInt(100);
//        }
//
//        watch.start();
//        System.out.println(watch.getStartTime());
//        selectionSort(list);
//        watch.stop();
//        System.out.println(watch.getEndTime());
//        System.out.println(watch.getElapsedTime());

        // Exercise 9.07

//        Account account = new Account(1122, 20000);
//        account.setAnnualInterestRate(4.5);
//        account.withdraw(2500);
//        account.deposit(3000);
//        System.out.println(account.getBalance());
//        System.out.println(account.getMonthlyInterest());
//        System.out.println(account.getDateCreated());

        // Exercise 9.08

//        Fan fan1 = new Fan();
//        fan1.setSpeed(Fan.FAST);
//        fan1.setRadius(10);
//        fan1.setColour("yellow");
//        fan1.setOn(true);
//        System.out.println(fan1.toString());
//
//        Fan fan2 = new Fan();
//        fan2.setSpeed(Fan.MEDIUM);
//        fan2.setRadius(5);
//        fan2.setColour("blue");
//        fan2.setOn(false);
//        System.out.println(fan2.toString());

        // Exercise 9.09

//        RegularPolygon polygon1 = new RegularPolygon();
//        System.out.println("1. perimeter: " + polygon1.getPerimeter() + ", area: " + polygon1.getArea());
//        RegularPolygon polygon2 = new RegularPolygon(6, 4);
//        System.out.println("2. perimeter: " + polygon2.getPerimeter() + ", area: " + polygon2.getArea());
//        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
//        System.out.println("3. perimeter: " + polygon3.getPerimeter() + ", area: " + polygon3.getArea());

        // Exercise 9.10

//        QuadraticEquation equation1 = new QuadraticEquation(1, 3.0, 1);
//        if (equation1.getDiscriminant() > 0)
//            System.out.println("Roots " + equation1.getRoot1() + ", " + equation1.getRoot2());
//        else if (equation1.getDiscriminant() == 0)
//            System.out.println("Root: " + equation1.getRoot1());
//        else
//            System.out.println("Equation has no roots");
//
//        QuadraticEquation equation2 = new QuadraticEquation(1, 2.0, 1);
//        if (equation2.getDiscriminant() > 0)
//            System.out.println("Roots " + equation2.getRoot1() + ", " + equation2.getRoot2());
//        else if (equation2.getDiscriminant() == 0)
//            System.out.println("Root: " + equation2.getRoot1());
//        else
//            System.out.println("Equation has no roots");
//
//        QuadraticEquation equation3 = new QuadraticEquation(1, 2, 3 );
//        if (equation3.getDiscriminant() > 0)
//            System.out.println("Roots " + equation3.getRoot1() + ", " + equation3.getRoot2());
//        else if (equation3.getDiscriminant() == 0)
//            System.out.println("Root: " + equation3.getRoot1());
//        else
//            System.out.println("Equation has no roots");

        // Exercise 9.11

//        LinearEquation equation1 = new LinearEquation(9.0, 4.0, 3.0, -5.0, -6.0, -21.0);
//        if (equation1.isSolvable())
//            System.out.println("x is " + equation1.getX() + ", y is " + equation1.getY());
//        else
//            System.out.println("The equation has no solution");
//
//        LinearEquation equation2 = new LinearEquation(1.0, 2.0, 2.0, 4.0, 4.0, 5.0);
//        if (equation2.isSolvable())
//            System.out.println("x is " + equation2.getX() + ", y is " + equation2.getY());
//        else
//            System.out.println("The equation has no solutions");

        // Exercise 9.12

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter coordinates for 4 points");
//        double[][] points = new double[4][2];
//
//        for (int i = 0; i < points.length; i++) {
//            for (int j = 0; j < points[i].length; j++) {
//                points[i][j] = input.nextDouble();
//            }
//        }
//
//        double a = (points[0][1] - points[1][1]);
//        double b = (points[0][0] - points[1][0]);
//        double c = (points[2][1] - points[3][1]);
//        double d = (points[2][0] - points[3][0]);
//        double e = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
//        double f = (points[2][1] - points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];
//
//        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);
//        if (equation.isSolvable())
//            System.out.println("The intersecting point is at (" + equation.getX() + ", " + equation.getY() + ")");
//        else
//           System.out.println("The lines are parallel");

        // Exercise 9.13

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number of rows and columns in the array: ");
//        int rows = input.nextInt();
//        int columns = input.nextInt();
//        double[][] array = new double[rows][columns];
//
//        for (double[] i : array) {
//            for (int j = 0; j < i.length; j++) {
//                i[j] = input.nextDouble();
//            }
//        }
//
//        Location location = locateLargest(array);
//        System.out.println("The largest element is " + location.maxValue + " at (" +
//        location.row + ", " + location.column + ")");
    }

    public static void selectionSort(int[] list) {
        int index; // index of min number
        for (int i = 0; i < list.length; i++) {
            int min = list[i];
            index = i;
            for (int j = i + 1; j < list.length; j++) {
                if (min > list[j]) {
                    index = j;
                    min = list[j];
                }
            }

            // if indexes are diiferent swap
            if (index != i) {
                list[index] = list[i];
                list[i] = min;
            }
        }
    }

    public static Location locateLargest(double[][] a) {
        Location location = new Location();
        location.row = 0;
        location.column = 0;
        location.maxValue = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > location.maxValue) {
                    location.maxValue = a[i][j];
                    location.row = i;
                    location.column = j;
                }
            }
        }
        return location;
    }
}
