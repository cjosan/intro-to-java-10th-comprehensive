/*
	 (Geometry: area of a hexagon) Write a program that prompts the user to enter the
	side of a hexagon and displays its area.
 */

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        double hexagonSide, area;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the side of the Hexagon:");
        hexagonSide = sc.nextDouble();
        
        area = (3 * Math.sqrt(3.0)) / 2 * Math.pow(hexagonSide, 2.0);
        System.out.println("The area is: " + area);
    }
}
