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
public class Exercise09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        char character;
        System.out.println("Enter a character:");
        input = sc.nextLine();
        character = input.charAt(0);
        System.out.println("The Unicode for the character " + character + " is " + (int)character );
    }
}
