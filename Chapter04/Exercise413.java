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
public class Exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input;
        char letter;
        System.out.println("Enter a letter:");
        input = sc.nextLine();
        letter = Character.toLowerCase(input.charAt(0));
        
        if(Character.isLetter(letter) && (letter == 'a' || letter == 'e' || letter =='i' || letter == 'o' || letter == 'u' || letter == 'y'))
            System.out.println(letter + " is a vowel!");
        else if(Character.isLetter(letter))
            System.out.println(letter + " is a consonant!");
        else 
            System.out.println(letter + " is an invalid input");
    }
}
