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
public class Exercise18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char major;
        char status;
        String input;
        System.out.println("Enter you major and status by 2 characters:");
        input = sc.nextLine();
        major = Character.toUpperCase(input.charAt(0));
        status = input.charAt(1);
        
        switch(major){
            case 'M':
                System.out.print("Mathematics ");
                break;
            case 'C':
                System.out.print("Computer Science ");
                break;
            case 'I':
                System.out.print("Information Technology ");
                break;
            default:
                System.out.println("You entered an invalid character for major!");
                System.exit(1);
        }
        
        switch(status){
            case '1':
                System.out.println("Freshman");
                break;
            case '2':
                System.out.println("Sophomore");
                break;
            case '3':
                System.out.println("Junior");
                break;
            case '4':
                System.out.println("Senior");
                break;
            default:
                System.out.println("\nYou entered an invalid character for status!");
        }
    }
}
