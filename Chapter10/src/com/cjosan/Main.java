package com.cjosan;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Exercise 10.01

//        Time time1 = new Time();
//        System.out.println(time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
//        Time time2 = new Time(555550000);
//        System.out.println(time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());

        // Exercise 10.03

//        MyInteger integer1 = new MyInteger(5);
//        MyInteger integer2 = new MyInteger(5);
//        char[] integers = {'1', '2', '3'};
//
//        System.out.println(integer1.getValue());
//        System.out.println(integer1.isEven());
//        System.out.println(integer1.isOdd());
//        System.out.println(integer1.isPrime());
//        System.out.println(MyInteger.isEven(4));
//        System.out.println(MyInteger.isOdd(4));
//        System.out.println(MyInteger.isPrime(4));
//        System.out.println(MyInteger.isEven(integer1));
//        System.out.println(MyInteger.isOdd(integer1));
//        System.out.println(MyInteger.isPrime(integer1));
//        System.out.println(integer1.equals(5));
//        System.out.println(integer1.equals(integer2));
//        System.out.println(integer1.parseInt(integers));
//        System.out.println(integer1.parseInt("456"));

        // Exercise 10.04

//        MyPoint point1 = new MyPoint();
//        MyPoint point2 = new MyPoint(10, 30.5);
//        System.out.println(point1.distance(point2));

        // Exercise 10.05

//        Scanner input = new Scanner(System.in);
//        StackOfIntegers stack = new StackOfIntegers();
//        System.out.println("Enter a positive integer: ");
//        int number = input.nextInt();
//        int divisor = number / 2;
//
//        while (number > 1) {
//            if (MyInteger.isPrime(divisor)) {
//                while (number % divisor == 0) {
//                    stack.push(divisor);
//                    number /= divisor;
//                }
//            }
//            divisor--;
//        }
//
//        while(!stack.empty())
//            System.out.println(stack.pop());

        // Exercise 10.06

//        StackOfIntegers stack = new StackOfIntegers();
//
//        for (int i = 2; i < 120; i++) {
//            if (MyInteger.isPrime(i))
//                stack.push(i);
//        }
//
//        while (!stack.empty())
//            System.out.println(stack.pop());

        // Exercise 10.07

//        Scanner input = new Scanner(System.in);
//        Account[] accounts = new Account[10];
//
//        for (int i = 0; i < 10; i++) {
//            accounts[i] = new Account(i, 100);
//        }
//
//        while (true) {
//            int id = askId(accounts);
//            displayMainMenu();
//            int choice = getChoice();
//
//            switch (choice) {
//                case 1:
//                    System.out.println("You balance is " + accounts[id].getBalance());
//                    break;
//                case 2:
//                    System.out.print("Enter an amount to withdraw: ");
//                    double amount = input.nextDouble();
//                    accounts[id].withdraw(amount);
//                    break;
//                case 3:
//                    System.out.print("Enter an amount to deposit: ");
//                    amount = input.nextDouble();
//                    accounts[id].deposit(amount);
//                    break;
//                case 4:
//                    continue;
//            }
//        }

        // Exercise 10.08

//        System.out.println("2009");
//        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
//        int[][] brackets = {
//                {8350, 33950, 82250, 171550, 372950},  // Single filer
//                {16700, 67900, 137050, 20885, 372950}, // Married jointly -or qualifying widow(er)
//                {8350, 33950, 68525, 104425, 186475},  // Married separately
//                {11950, 45500, 117450, 190200, 372950}}; // Head of household
//        Tax tax = new Tax(0, brackets, rates, 0);
//        displayTaxTable(tax);
//
//        System.out.println("\n2001");
//        double[] rates2 = {0.15, 0.275, 0.305, 0.355, 0.391};
//        int[][] brackets2 = {
//                {27050, 65550, 136750, 297350},
//                {45200, 109250, 166500, 297350},
//                {22600, 54625, 83250, 148675},
//                {36250, 93650, 151650, 297350}};
//        Tax tax2 = new Tax(0, brackets2, rates2, 0);
//        displayTaxTable(tax2);

        // Exercise 10.09

//        Course course = new Course("Engineering");
//        course.addStudent("John Somnez");
//        course.addStudent("James White");
//        course.addStudent("Sirius Black");
//        course.dropStudent("James White");
//
//        for (int i = 0; i < course.getNumberOfStudents(); i++)
//            System.out.println(course.getStudents()[i]);

        // Exercise 10.10

//        Queue queue = new Queue();
//
//        for (int i = 1; i <= 20; i++) {
//            queue.enqueue(i);
//        }
//
//        while (!queue.empty()) {
//            System.out.println(queue.dequeue());
//        }

        // Exercise 10.11

//        Circle2D c1 = new Circle2D(2, 2, 5.5);
//        System.out.println("area: " + c1.getArea() + "\nperimeter: " + c1.getPerimeter());
//        System.out.println(c1.contains(3, 3));
//        System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
//        System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));

        // Exercise 10.12

//        Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
//        System.out.println("area: " + t1.getArea() + "\nperimeter: " + t1.getPerimeter());
//        System.out.println(t1.contains(new MyPoint(3, 3)));
//        System.out.println(t1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));
//        System.out.println(t1.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2, 6.5))));

        // Exercise 10.13

//        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
//        System.out.println("area: " + r1.getArea() + "\nperimeter: " + r1.getPerimeter());
//        System.out.println(r1.contains(3, 3));
//        System.out.println(r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
//        System.out.println(r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));

        // Exercise 10.14

//        MyDate date1 = new MyDate();
//        MyDate date2 = new MyDate(34355555133101L);
//
//        System.out.println(date1.getDay() + "/" + date1.getMonth() + "/" + date1.getYear());
//        System.out.println(date2.getDay() + "/" + date2.getMonth() + "/" + date2.getYear());

        // Exercise 10.15

//        Scanner input = new Scanner(System.in);
//        double[][] points = new double[5][2];
//
//        System.out.println("Enter five points: ");
//        for (int i = 0; i < points.length; i++) {
//            for (int j = 0; j < points[i].length; j++) {
//                points[i][j] = input.nextDouble();
//            }
//        }
//
//        MyRectangle2D rectangle = getRectangle(points);
//        System.out.println("The bounding rectangle's center (" + rectangle.getX() + ", " + rectangle.getY() + "), "
//                + "width " + rectangle.getWidth() + ", height " + rectangle.getHeight());

        // Exercise 10.16

//        String s = "1";
//        for (int i = 0; i < 49; i++) {
//            s += "0";
//        }
//
//        BigInteger number = new BigInteger(s);
//        BigInteger divisor1 = new BigInteger("2");
//        BigInteger divisor2 = new BigInteger("3");
//
//        int count = 0;
//
//        while (count < 10) {
//            if (number.remainder(divisor1).equals(BigInteger.ZERO) || number.remainder(divisor2).equals(BigInteger.ZERO)) {
//                System.out.println(number);
//                count++;
//            }
//
//            number = number.add(BigInteger.ONE);
//        }

        // Exercise 10.17

//        BigInteger maxLong = new BigInteger(Long.MAX_VALUE + "");
//        BigInteger number = new BigInteger(String.valueOf((long) Math.sqrt(Long.MAX_VALUE)));
//
//        int count = 0;
//        while (count < 10) {
//            if (number.pow(2).compareTo(maxLong) > 0) {
//                System.out.println(number.pow(2));
//                count++;
//            }
//
//            number = number.add(BigInteger.ONE);
//        }

        // Exercise 10.18

//        BigInteger number = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
//
//        int count = 0;
//        while (count < 5) {
//            if (isPrime(number)) {
//                System.out.println(number);
//                count++;
//            }
//
//            number = number.add(BigInteger.ONE);
//        }

        // Exercise 10.19

//        int p = 2;
//
//        while (p <= 100) {
//            BigInteger n = new BigInteger("2").pow(p).subtract(BigInteger.ONE);
//            if (isPrime(p) && isPrime(n)) {
//                System.out.println(p + "\t" + n);
//            }
//            p++;
//        }

        // Exercise 10.20

//        String temp = "1.";
//        for (int i = 0; i < 25; i++) {
//            temp += 0;
//        }
//
//        BigDecimal e = new BigDecimal(temp);
//        BigDecimal factorial = BigDecimal.ONE;
//
//        for (int i = 100; i <= 1000; i += 100) {
//            for (int j = 1; j <= i; j++) {
//                factorial = factorial.multiply(new BigDecimal(j));
//                e = e.add(BigDecimal.ONE.divide(factorial, 25, BigDecimal.ROUND_UP));
//            }
//            System.out.println(e);
//            e = BigDecimal.ONE;
//            factorial = BigDecimal.ONE;
//        }

        // Exercise 10.21

//        BigInteger number = new BigInteger(String.valueOf(Long.MAX_VALUE ));
//        BigInteger div1 = new BigInteger("5");
//        BigInteger div2 = new BigInteger("6");
//
//
//        int count = 0;
//        while (count < 10) {
//            number = number.add(BigInteger.ONE);
//
//            if (number.remainder(div1).equals(BigInteger.ZERO) || number.remainder(div2).equals(BigInteger.ZERO)) {
//                System.out.println(number);
//                count++;
//            }
//        }

        // Exercise 10.22

//        char[] chars = {'I', 'n', 't', 'r', 'o', 'd', 'u', 'c', 't', 'i', 'o', 'n'};
//
//        MyString1 string = new MyString1(chars);
//        System.out.println(string.charAt(2));
//        System.out.println(string.length());
//        System.out.println(Arrays.toString(string.substring(0, 4).getValue()));
//        System.out.println(Arrays.toString(string.toLowerCase().getValue()));
//        System.out.println(string.equals(new MyString1(new char[]{'i', 'n', 't'})));
//        System.out.println(Arrays.toString(string.valueOf(123).getValue()));

        // Exercise 10.23

//        MyString2 str = new MyString2("abcdef");
//
//        System.out.println(str.compare("defghi"));
//        System.out.println(str.substring(3).getValue());
//        System.out.println(str.toUpperCase().getValue());
//        System.out.println(Arrays.toString(str.toChars()));
//        System.out.println(str.valueOf(true).getValue());

        // Exercise 10.24

//        MyCharacter ch = new MyCharacter('a');
//        MyCharacter ch2 = new MyCharacter('A');
//
//        System.out.println(ch.compare(ch2));
//        System.out.println(ch.isLowerCase());
//        System.out.println(ch.isUpperCase());
//        System.out.println(ch2.toLowerCase().charValue());
//        System.out.println(ch.toUpperCase().charValue());
//        System.out.println(ch.isAlphabetical());
//        System.out.println(ch.isDigit());
//        System.out.println(ch.isAlphabeticalOrDigit());
//        System.out.println(ch.valueOf(3).charValue());

        // Exercise 10.25

//        String[] str = split("ab#12#453#", "#");
//        String[] str2 = split("a?b?gf#e", "[?#]");
//
//        System.out.println(Arrays.toString(str));
//        System.out.println(Arrays.toString(str2));

        // Exercise 10.26

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the expression: ");
//        String expression = input.nextLine();
//        expression = expression.replaceAll(" ", "");
//
//        if (expression.length() != 3) {
//            System.out.println(
//                    "Usage: operand1 operator operand2");
//            System.exit(0);
//        }
//
//        // The result of the operation
//        int result = 0;
//
//        // Determine the operator
//        switch (expression.charAt(1)) {
//            case '+':
//                result = Integer.parseInt(String.valueOf(expression.charAt(0))) +
//                        Integer.parseInt(String.valueOf(expression.charAt(2)));
//                break;
//            case '-':
//                result = Integer.parseInt(String.valueOf(expression.charAt(0))) -
//                        Integer.parseInt(String.valueOf(expression.charAt(2)));
//                break;
//            case '*':
//                result = Integer.parseInt(String.valueOf(expression.charAt(0))) *
//                        Integer.parseInt(String.valueOf(expression.charAt(2)));
//                break;
//            case '/':
//                result = Integer.parseInt(String.valueOf(expression.charAt(0))) /
//                        Integer.parseInt(String.valueOf(expression.charAt(2)));
//        }
//
//        // Display result
//        System.out.println(expression.charAt(0) + " " + expression.charAt(1) + " " + expression.charAt(2) + " = " + result);

        // Exercise 10.27

//        MyStringBuilder1 str1 = new MyStringBuilder1("TopProgrammer");
//        MyStringBuilder1 str2 = new MyStringBuilder1("IAm");
//
//        System.out.println(str2.append(str1).toString());
//        System.out.println(str1.length());
//        System.out.println(str1.charAt(4));
//        System.out.println(str1.toLowerCase().toString());
//        System.out.println(str1.substring(0, 4).toString());

        // Exercise 10.28

//        MyStringBuilder2 str1 = new MyStringBuilder2();
//        MyStringBuilder2 str2 = new MyStringBuilder2("Still");
//        MyStringBuilder2 str3 = new MyStringBuilder2(new char[]{'T', 'o', 'p'});
//
//        System.out.println(str1.getValue());
//        System.out.println(str2.getValue());
//        System.out.println(str3.getValue());
//
//        System.out.println(str3.insert(0, str2).getValue());
//        System.out.println(str2.reverse().getValue());
//        System.out.println(str2.substring(1).getValue());
//        System.out.println(str2.toUpperCase().getValue());

    }

    public static String[] split(String s, String regex) {
        char[] delimiters = regex.toCharArray();
        int length = getLength(s, delimiters);
        String[] str = new String[length];

        for (int i = 0, j = 0; i < str.length; i += 2) {
            str[i] = "";
            while (!contains(delimiters, s.charAt(j))) {
                str[i] += s.charAt(j);
                j++;

                if (j == s.length())
                    break;
            }

            if (i <= s.length() - 1 && j <= s.length() - 1) {
                str[i + 1] = String.valueOf(s.charAt(j));
                j++;
            }
        }

        return str;
    }

    public static int getLength(String s, char[] delimiters) {
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            if (contains(delimiters, s.charAt(i))) {
                length++;
            }
        }
        length = length * 2 + 1;

        if (contains(delimiters, s.charAt(s.length() - 1)))
            length--;

        return length;
    }

    public static boolean contains(char[] delimiters, char ch) {
        for (int i = 0; i < delimiters.length; i++) {
            if (ch == delimiters[i])
                return true;
        }
        return false;
    }

    public static boolean isPrime(BigInteger number) {
        if (!number.isProbablePrime(5))
            return false;

        BigInteger two = new BigInteger("2");
        if (!two.equals(number) && BigInteger.ZERO.equals(number.mod(two)))
            return false;

        for (BigInteger i = new BigInteger("3"); i.multiply(i).compareTo(number) < 1; i = i.add(two)) {
            if (BigInteger.ZERO.equals(number.mod(i)))
                return false;
        }
        return true;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static MyRectangle2D getRectangle(double[][] points) {
        MyRectangle2D rectangle = new MyRectangle2D();
        double highestPoint = Math.abs(getHighestPoint(points));
        double lowestPoint = Math.abs(getLowestPoint(points));
        double rightmostPoint = Math.abs(getRightmostPoint(points));
        double leftmostPoint = Math.abs(getLeftmostPoint(points));

        rectangle.setWidth(rightmostPoint - leftmostPoint);
        rectangle.setHeight(highestPoint - lowestPoint);
        rectangle.setX((leftmostPoint + rightmostPoint) / 2.0);
        rectangle.setY((lowestPoint + highestPoint) / 2.0);

        return rectangle;
    }

    public static double getHighestPoint(double[][] points) {
        double temp = points[0][1];
        for (double[] point : points) {
            if (point[1] > temp)
                temp = point[1];
        }

        return temp;
    }

    public static double getLowestPoint(double[][] points) {
        double temp = points[0][1];
        for (double[] point : points) {
            if (point[1] < temp)
                temp = point[1];
        }

        return temp;
    }

    public static double getRightmostPoint(double[][] points) {
        double temp = points[0][0];
        for (double[] point : points) {
            if (point[0] > temp)
                temp = point[0];
        }

        return temp;
    }

    public static double getLeftmostPoint(double[][] points) {
        double temp = points[0][0];
        for (double[] point : points) {
            if (point[0] < temp)
                temp = point[0];
        }

        return temp;
    }

    public static void displayTaxTable(Tax tax) {
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\tMarried Filing Jointly\t\tMarried Filing\t\t\tHead");
        System.out.println(("Salary\t\t\tSingle\t\t\tor Qualifying Widow(er)\t\tSeparately\t\t\tof Household"));
        System.out.println("--------------------------------------------------------------------------------------------");

        for (int i = 50000; i <= 60000; i += 1000) {
            System.out.printf("%d", i);
            tax.setTaxableIncome(i);
            for (int j = 0; j <= 3; j++) {
                tax.setFilingStatus(j);
                System.out.printf("\t\t\t\t%.0f", tax.getTax());
            }
            System.out.println();
        }
    }

    public static void displayMainMenu() {
        System.out.println("Main menu");
        System.out.println("1: check balance\n2: withdraw\n3: deposit\n4: exit");
    }

    public static int askId(Account[] accounts) {
        Scanner input = new Scanner(System.in);
        int id;

        while (true) {
            System.out.print("Enter an id: ");
            id = input.nextInt();

            for (int i = 0; i < accounts.length; i++) {
                if (id == accounts[i].getId())
                    return id;
            }

            System.out.println("The id you entered is invalid. Please try again!");
        }
    }

    public static int getChoice() {
        Scanner input = new Scanner(System.in);
        int choice;
        while (true){
            System.out.print("Enter a choice: ");
            choice = input.nextInt();

            if (choice > 0 && choice < 5)
                return choice;

            System.out.println("You choosed a wrong option. Please try again!");
        }
    }
}