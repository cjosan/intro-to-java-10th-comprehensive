/*
    (Sum the digits in an integer) Write a program that reads an integer between 0 and
    1000 and adds all the digits in the integer. For example, if an integer is 932, the
    sum of all its digits is 14.
    Hint: Use the % operator to extract digits, and use the / operator to remove the
    extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
 */

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        int number, digit;
        int sumOfDigits = 0;
        
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Enter a number between 0 and 1000:");
            number = sc.nextInt();
        } while(number <= 0 && number >= 1000);
        
        while(number > 0){
            digit = number % 10;
            sumOfDigits += digit;
            number /= 10;
        }
        System.out.println("The sum of the digits is " + sumOfDigits);
    }
}
