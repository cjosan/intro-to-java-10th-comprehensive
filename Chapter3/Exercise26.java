/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an integer:");
        int userInput = sc.nextInt();
        
        System.out.println("Is " + userInput + " divisible by 5 and 6? " + (userInput % 5 == 0 && userInput % 6 == 0));
        System.out.println("Is " + userInput + " divisible by 5 or 6? " + (userInput % 5 == 0 || userInput % 6 == 0));
        System.out.println("Is " + userInput + " divisible by 5 or 6, but not both? " + (userInput % 5 == 0 ^ userInput % 6 == 0));
    }
}
