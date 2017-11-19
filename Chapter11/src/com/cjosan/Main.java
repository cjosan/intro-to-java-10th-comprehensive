package com.cjosan;

import javafx.scene.shape.Circle;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Exercise 11.01

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the sides of triangle");
//        double side1 = input.nextDouble();
//        double side2 = input.nextDouble();
//        double side3 = Double.parseDouble(input.nextLine());
//        System.out.println("Enter the color of triangle and if it is filled");
//        String color = input.nextLine();
//        boolean filled = input.nextBoolean();
//
//        Triangle triangle = new Triangle(color, filled, side1, side2, side3);
//        System.out.println("Area: " + triangle.getArea() + "\nPerimeter: " + triangle.getPerimeter() +
//        "\nColor: " + triangle.getColor() + "\nFilled: " + triangle.isFilled());

        // Exercise 11.02

//        Person[] persons = new Person[5];
//
//        persons[0] = new Person();
//        persons[1] = new Student("Freshman");
//        persons[2] = new Employee();
//        persons[3] = new Faculty();
//        persons[4] = new Staff();
//
//       for (Person person : persons) {
//           System.out.println(person.toString());
//       }

        // Exercise 11.03

//        Account[] accounts = new Account[3];
//        accounts[0] = new Account();
//        accounts[1] = new CheckingAccount();
//        accounts[2] = new SavingsAccount();
//
//        for (Account account : accounts) {
//            System.out.println(account.toString());
//        }

        // Exercise 11.04

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a list of integers ending with 0");
//        int number;
//        ArrayList<Integer> list = new ArrayList<>();
//
//        do {
//            number = input.nextInt();
//
//            if (number != 0)
//                list.add(number);
//        } while (number != 0);
//
//        System.out.println("The max elemet is: " + max(list));

        // Exercise 11.05

//        Course course = new Course("Cs");
//        course.addStudent("John");
//        course.addStudent("Jack");
//        course.addStudent("Mark");
//        System.out.println(course.getStudents().toString());
//        course.dropStudent("John");
//        System.out.println(course.getStudents().toString());

        // Exercise 11.06

//        ArrayList<Object> list = new ArrayList<>();
//        list.add(new Account());
//        list.add(new Triangle());
//        list.add(new Date());
//
//        for (Object element : list)
//            System.out.println(element.toString());

        // Exercise 11.07

//        ArrayList<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            list.add(i);
//        }
//        System.out.println(list.toString());
//
//        shuffle(list);
//        System.out.println(list.toString());

        // Exercise 11.08

//        NewAccount account = new NewAccount("George", 1122, 1000, 1.5);
//        account.deposit(30);
//        account.deposit(40);
//        account.deposit(50);
//        account.withdraw(5);
//        account.withdraw(4);
//        account.withdraw(2);
//        System.out.println("\nAccount holder name: " + account.getName() + "\nInterest rate: " + account.getAnnualInterestRate() +
//                "\nBalance: " + account.getBalance() + "\nTransactions: ");
//
//        for (Transaction transaction : account.getTransactions()) {
//            System.out.println(transaction.getDescription());
//        }

        // Exercise 11.09

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the matrix size: ");
//        int n = input.nextInt();
//        int[][] matrix = new int[n][n];
//        ArrayList<Integer> largestRows = new ArrayList<>();
//        ArrayList<Integer> largestColumns = new ArrayList<>();
//
//        for (int[] row : matrix) {
//            for (int column = 0; column < row.length; column++) {
//                row[column] = (int)(Math.random() * 2);
//            }
//        }
//
//        for (int[] row : matrix) {
//            for (int i = 0; i < row.length; i++) {
//                System.out.print(row[i]);
//            }
//            System.out.println();
//        }
//
//        checkRows(matrix, largestRows);
//        checkColumns(matrix, largestColumns);
//
//        System.out.print("The largest row index: ");
//        for (int row : largestRows)
//            System.out.print(row + " ");
//
//        System.out.print("\nThe largest column index: ");
//        for (int column : largestColumns)
//            System.out.print(column + " ");

        // Exercise 11.10

//        Scanner input = new Scanner(System.in);
//        MyStack stack = new MyStack();
//
//        System.out.println("Enter 5 strings");
//        for (int i = 0; i < 5; i++) {
//            stack.push(input.nextLine());
//        }
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(stack.pop());
//        }

        // Exercise 11.11

//        Scanner input = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>();
//
//        System.out.println("Enter 5 integers");
//        for (int i = 0; i < 5; i++) {
//            list.add(input.nextInt());
//        }
//
//        sort(list);
//        for (int e : list) {
//            System.out.println(e);
//        }

        // Exercise 11.12

//        Scanner input = new Scanner(System.in);
//        ArrayList<Double> list = new ArrayList<>();
//
//        System.out.println("Enter 5 integers");
//        for (int i = 0; i < 5; i++) {
//            list.add(input.nextDouble());
//        }
//
//        System.out.println("The sum of elements is: " + sum(list));

        // Exercise 11.13

//        Scanner input = new Scanner(System.in);
//        ArrayList<Integer> list = new ArrayList<>();
//
//        System.out.println("Enter 10 integers");
//        for (int i = 0; i < 10; i++) {
//            list.add(input.nextInt());
//        }
//
//        removeDuplicate(list);
//        System.out.print("The distinct integers are ");
//        for (int element : list)
//            System.out.print(element + " ");

        // Exercise 11.14

//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter five integers for list1: ");
//        ArrayList<Integer> list1 = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            list1.add(input.nextInt());
//        }
//
//        System.out.print("Enter five integers for list2: ");
//        ArrayList<Integer> list2 = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            list2.add(input.nextInt());
//        }
//
//        ArrayList<Integer> union = union(list1, list2);
//        System.out.print("The combined list is: ");
//        for (int element : union)
//            System.out.print(element + " ");

        // Exercise 11.15

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the number of the points: ");
//        int size = input.nextInt();
//        double[][] points = new double[size][2];
//
//        System.out.println("Enter the coordinates of the points:");
//        for (int i = 0; i < points.length; i++) {
//            points[i][0] = input.nextDouble();
//            points[i][1] = input.nextDouble();
//        }
//
//        double sum1 = 0;
//        double sum2 = 0;
//        for (int i = size - 1; i >= 0; i--) {
//            if (i == 0) {
//                sum1 += (points[i][0] * points[size - 1][1]);
//                sum2 += (points[i][1] * points[size - 1][0]);
//            } else {
//                sum1 += (points[i][0] * points[i - 1][1]);
//                sum2 += (points[i][1] * points[i - 1][0]);
//            }
//        }
//
//        double area = (sum1 - sum2) / 2;
//        System.out.println("The total area is: " + area);

        // Exercise 11.16

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        ArrayList<Integer> answers = new ArrayList<>();

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        while (number1 + number2 != answer) {
            System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
            answers.add(answer);

            for (int i = 0; i < answers.size(); i++) {
                if (i != answers.size() - 1 && answer == answers.get(i)) {
                    System.out.println("You already entered " + answer);
                    break;
                }
            }
        }

        System.out.println("You got it!");
    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> union = new ArrayList<>();

        for (int element : list1) {
            union.add(element);
        }

        for (int element : list2) {
            union.add(element);
        }

        return union;
    }

    public static void removeDuplicate(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                if (i != j && number == list.get(j))
                    list.remove((Integer)number);
            }
        }
    }

    public static double sum(ArrayList<Double> list) {
        double sum = 0;
        for (double element : list) {
            sum += element;
        }

        return sum;
    }

    public static void sort(ArrayList<Integer> list) {
        int temp; // index of min number
        for (int i = 0; i < list.size(); i++) {
            int min = list.get(i);
            temp = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (min > list.get(j)) {
                    temp = j;
                    min = list.get(j);
                }
            }

            // if indexes are diiferent swap, else the array is sorted
            if (temp != i) {
                list.set(temp, list.get(i));
                list.set(i, min);
            }
        }
    }

    public static void checkRows(int[][] matrix, ArrayList largestRows) {
        int count = 0;
        int maxCount = 0;
        int[] counts = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1)
                    count++;
            }
            if (count > maxCount)
                maxCount = count;

            counts[i] = count;
            count = 0;
        }

        for(int i = 0; i < counts.length; i++) {
            if (counts[i] == maxCount)
                largestRows.add(i);
        }
    }

    public static void checkColumns(int[][] matrix, ArrayList largestColumns) {
        int count = 0;
        int maxCount = 0;
        int[] counts = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[j][i] == 1)
                    count++;
            }
            if (count > maxCount)
                maxCount = count;

            counts[i] = count;
            count = 0;
        }

        for(int i = 0; i < counts.length; i++) {
            if (counts[i] == maxCount)
                largestColumns.add(i);
        }
    }

    public static void shuffle(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int index = (int)(Math.random() * list.size());
            Integer temp;
            temp = list.get(i);
            list.set(i, list.get(index));
            list.set(index, temp);
        }
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty())
            return null;

        Integer max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max < list.get(i))
                max = list.get(i);
        }

        return max;
    }
}
