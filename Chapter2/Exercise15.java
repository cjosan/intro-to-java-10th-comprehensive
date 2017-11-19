/*
    (Geometry: distance of two points) Write a program that prompts the user to enter
    two points (x1, y1) and (x2, y2) and displays their distance between them.
    The formula for computing the distance is sqrt((x2 - x1)^2 + (y2 - y1)^2). Note that
    you can use Math.pow(a, 0.5) to compute sqrt(a).
 */

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        double x1, y1, x2, y2, distance;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the coordonates of the first point:");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        System.out.println("Enter the coordonates of the second point:");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        
        distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println(distance);
    }
}
