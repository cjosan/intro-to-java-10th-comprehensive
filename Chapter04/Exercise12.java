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
public class Exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        char hexDigit;
        System.out.println("Enter a hex digit:");
        input = sc.nextLine();
        hexDigit = Character.toUpperCase(input.charAt(0));
        int binary = 1010;
        switch(hexDigit){
            case 'A':
                System.out.println(binary);
                break;
            case 'B':
                System.out.println(binary += 1);
                break;
            case 'C':
                System.out.println(binary += 2);
                break;
            case 'D':
                System.out.println(binary += 3);
                break;
            case 'E':
                System.out.println(binary += 4);
                break;
            case 'F':
                System.out.println(binary += 5);
                break;
            default:
                System.out.println(input + " is an invalid input");
        }
    }
}
