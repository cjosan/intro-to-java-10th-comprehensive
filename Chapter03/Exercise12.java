/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, firstDigit, lastDigit, length;
        
        do{
            System.out.println("Enter a three-digit number:");
            number = sc.nextInt();
            length = String.valueOf(number).length();
        }while(length != 3);
        
        firstDigit = number / 100;
        lastDigit = number % 10;
        
        if(firstDigit == lastDigit){
            System.out.println("The number is a palindrome!");
        }
        else{
            System.out.println("The number is not a palindrome!");
        }
    }
}
