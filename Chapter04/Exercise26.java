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
public class Exercise26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an amount:");
        String totalAmount = input.nextLine();
        
        int decPoint = totalAmount.indexOf('.');
        int amount = Integer.parseInt(totalAmount.substring(0, decPoint));
        int remainingAmount = Integer.parseInt(totalAmount.substring(decPoint + 1));

        int numberOfOneDollars = amount;

        int numberOfQuarters = remainingAmount / 25; 
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters ");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
    }
}
