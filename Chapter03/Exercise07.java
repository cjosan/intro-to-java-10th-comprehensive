/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an amount:");
        int amount = input.nextInt();

        int remainingAmount = amount;

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters = remainingAmount / 25; 
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");
        if(numberOfOneDollars == 1){
            System.out.println(" " + numberOfOneDollars + " dollar");
        }
        else
            System.out.println(" " + numberOfOneDollars + " dollars");
        
        if(numberOfQuarters == 1){
            System.out.println(" " + numberOfQuarters + " quarter");
        }
        else
            System.out.println(" " + numberOfQuarters + " quarters ");
        
        if(numberOfDimes == 1){
            System.out.println(" " + numberOfDimes + " dime");
        }
        else
            System.out.println(" " + numberOfDimes + " dimes");
        
        if(numberOfNickels == 1){
            System.out.println(" " + numberOfNickels + " nickel");
        }
        else
            System.out.println(" " + numberOfNickels + " nickels");
        
        if(numberOfPennies == 1){
            System.out.println(" " + numberOfPennies + " pennie");
        }
        else
            System.out.println(" " + numberOfPennies + " pennies");
    }
}