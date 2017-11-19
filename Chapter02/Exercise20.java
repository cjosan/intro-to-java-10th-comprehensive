/*
     (Financial application: calculate interest) If you know the balance and the annual
    percentage interest rate, you can compute the interest on the next monthly payment
    using the following formula:
    interest = balance * (annualInterestRate/1200)
    Write a program that reads the balance and the annual percentage interest rate and
    displays the interest for the next month.
 */

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        double interest, balance, annualInterestRate;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the balance:");
        balance = sc.nextDouble();
        System.out.println("Enter the annual percentage rate:");
        annualInterestRate = sc.nextDouble();
        
        interest = balance * (annualInterestRate / 1200);
        System.out.println("The interest is:" + interest);
        
    }
}
