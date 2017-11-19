/*
    (Financial application: calculate tips) Write a program that reads the subtotal
    and the gratuity rate, then computes the gratuity and total. For example, if the
    user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
    as gratuity and $11.5 as total.
 */

import java.util.Scanner;

public class Exercise05 {
    
    public static void main(String[] args) {
        double subtotal, gratuityRate, gratuity, total;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the subtotal and a gratuity rate:");
        subtotal = sc.nextDouble();
        gratuityRate = sc.nextDouble();
        
        gratuity = gratuityRate / subtotal;
        
        total = subtotal + gratuity;
        
        System.out.println("The gratuity is " + gratuity + " and the total is " + total);
        
    }
}
