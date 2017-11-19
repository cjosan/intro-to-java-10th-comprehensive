/*
	(Convert pounds into kilograms) Write a program that converts pounds into kilograms.
	The program prompts the user to enter a number in pounds, converts it
	to kilograms, and displays the result. One pound is 0.454 kilograms.
 */

import java.util.Scanner;

public class Exercise04 {
    static final double POUND = 0.454;
    
   public static void main(String[] args) {
        double pounds, kilograms;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value in pounds:");
        pounds = sc.nextDouble();
        
        kilograms = pounds * POUND;
        
        System.out.println(pounds + " pounds is " + kilograms + " kilograms");
    }
}
