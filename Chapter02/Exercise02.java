/*
    (Compute the volume of a cylinder) Write a program that reads in the radius
    and length of a cylinder and computes the area and volume using the following
    formulas:
    area = radius * radius * pi
    volume = area * length
 */

import java.util.Scanner;

public class Exercise02 {
    final double PI = 3.14;
    
    public static void main(String[] args) {    
        double length, radius, area, volume;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the radius and length of a Cilinder:");
        radius = input.nextDouble();
        length = input.nextDouble();
        
        area = radius * radius * PI;
        volume = area * length;
        
        System.out.println("The area is: " + area);
        System.out.println("The volume is: " + volume);
    }
}
