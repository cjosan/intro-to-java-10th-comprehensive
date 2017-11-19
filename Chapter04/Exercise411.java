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
public class Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte decNumber;
        
        System.out.println("Enter a decimal value (0 - 15):");
        decNumber = sc.nextByte();
        
        if(decNumber >= 0 && decNumber <= 9)
            System.out.println("The hex value is " + decNumber);
        else
            switch(decNumber){
                case 10:
                    System.out.println("The hex value is A");
                    break;
                case 11:
                    System.out.println("The hex value is B");
                    break;
                case 12:
                    System.out.println("The hex value is C");
                    break;
                case 13:
                    System.out.println("The hex value is D");
                    break;
                case 14:
                    System.out.println("The hex value is E");
                    break;
                case 15:
                    System.out.println("The hex value is F");
                    break;
                default:
                    System.out.println("You entered an invalid number!");
            }
    }
}
