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
public class Exercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String grade;
        char letterGrade;
        System.out.println("Enter a letter grade:");
        grade = sc.nextLine();
        letterGrade = Character.toUpperCase(grade.charAt(0));
        
        switch(letterGrade){
            case 'A':
                System.out.println("The numeric value for grade is: 4");
                break;
            case 'B':
                System.out.println("The numeric value for grade is: 3");
                break;
            case 'C':
                System.out.println("The numeric value for grade is: 2");
                break;
            case 'D':
                System.out.println("The numeric value for grade is: 1");
                break;
            case 'F':
                System.out.println("The numeric value for grade is: 0");
                break;
            default:
                System.out.println(grade + " is an invalid letter grade!");
        }
    }
}
