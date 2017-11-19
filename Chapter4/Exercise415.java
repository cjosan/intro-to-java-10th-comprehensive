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
public class Exercise15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        char letter;
        System.out.println("Enter a letter:");
        input = sc.nextLine();
        letter = Character.toLowerCase(input.charAt(0));
        
        switch (letter) {
            case 'a':
            case 'b':
            case 'c':
                System.out.println("The corresponding number is 2");
                break;
            case 'd':
            case 'e':
            case 'f':
                System.out.println("The corresponding number is 3");
                break;
            case 'g':
            case 'h':
            case 'i':
                System.out.println("The corresponding number is 4");
                break;
            case 'j':
            case 'k':
            case 'l':
                System.out.println("The corresponding number is 5");
                break;
            case 'm':
            case 'n':
            case 'o':
                System.out.println("The corresponding number is 6");
                break;
            case 'p':
            case 'q':
            case 'r':
            case 's':
                System.out.println("The corresponding number is 7");
                break;
            case 't':
            case 'u':
            case 'v':
                System.out.println("The corresponding number is 8");
                break;
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                System.out.println("The corresponding number is 9");
                break;
            default:
                System.out.println(letter + " is an invalid input");
                break;
        }
    }
}
