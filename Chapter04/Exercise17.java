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
public class Exercise17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        String month;
        System.out.println("Enter a year:");
        year = Integer.parseInt(sc.nextLine());
        System.out.println("Enter a month:");
        month = sc.nextLine();
        month = Character.toUpperCase(month.charAt(0)) + month.substring(1, 3).toLowerCase();
        
        switch(month){
            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov":
                System.out.println(month + " " + year + " has 30 days!");
                break;
            case "Feb":
                if(!(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)))
                    System.out.println(month + " " + year + " has 28 days!");
                else
                    System.out.println(month + " " + year + " has 29 days!");
                break;
            default:
                System.out.println(month + " " + year + " has 31 days!");
            
        }
    }
}
