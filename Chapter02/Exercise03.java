/*
	(Convert feet into meters) Write a program that reads a number in feet, converts it
	to meters, and displays the result. One foot is 0.305 meter.
 */

import java.util.Scanner;

public class Exercise03 {
    static final double FOOT = 0.3048;
   
   public static void main(String[] args) {
        double meters, feet;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a value for feet:");
        feet = sc.nextDouble();
        
        meters = feet * FOOT;
        
        System.out.println(meters);
    }
}
