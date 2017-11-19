/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Exercise19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first9Digits;
        int length, lastDigit = 0, remainingDigits;
            
        do{
            System.out.println("Enter the first 9 integers of an ISBN:");
            first9Digits = sc.nextLine();
            length = first9Digits.length();
        }while(length != 9);
            
        remainingDigits = Integer.parseInt(first9Digits);

        for(int i = 0, j = 9; i < 9; i++, j--){
            lastDigit += (remainingDigits % 10) * j;
            remainingDigits /= 10;
        }
        if((lastDigit %= 11) == 10){
            System.out.println("The ISBN-10 number is : " + first9Digits + "X");
        }
        else{
        System.out.println("The ISBN-10 number is : " + first9Digits + lastDigit);
        }  
    }
}
