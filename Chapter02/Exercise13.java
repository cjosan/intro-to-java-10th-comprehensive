/*
    (Financial application: compound value) Suppose you save $100 each month
    into a savings account with the annual interest rate 5%. Thus, the monthly interest
    rate is 0.05/12 = 0.00417. After the first month, the value in the account
    becomes
    100 * (1 + 0.00417) = 100.417
    After the second month, the value in the account becomes
    (100 + 100.417) * (1 + 0.00417) = 201.252
    After the third month, the value in the account becomes
    (100 + 201.252) * (1 + 0.00417) = 302.507
    and so on.
    Write a program that prompts the user to enter a monthly saving amount and
    displays the account value after the sixth month.
 */

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        int numberOfMonths;
        int annualInterestRate = 5;
        double monthlySaving;
        double accountValue = 0;
        double monthlyInterestRate = (annualInterestRate / 100.0) / 12;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the monthly saving:");
        monthlySaving = sc.nextDouble();
        System.out.println("Enter the number of months:");
        numberOfMonths = sc.nextInt();
         
        for(int i = 0; i < numberOfMonths; i++){
            monthlySaving *= (1 + monthlyInterestRate);
            accountValue += monthlySaving;
        }
        System.out.println("The account value after " + numberOfMonths + " months is " + accountValue);
    }
}
