/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double feet, inches, height, weight, bmi;
        final double INCHES_TO_METERS = 0.0254;
        final double POUNDS_TO_KILLOS = 0.4535;
        
        System.out.println("Enter your weight in pounds:");
        weight = sc.nextDouble();
        System.out.println("Enter your height in feet and inches:");
        feet = sc.nextDouble();
        inches = sc.nextDouble();
        
        weight *= POUNDS_TO_KILLOS;
        height = ((feet * 12) + inches) * INCHES_TO_METERS;
        bmi = weight / (height * height);
        System.out.print("Your BMI is " + bmi);
        
        if(bmi < 18.5){
            System.out.println(" You're underweight!");
        }
        else if(bmi < 25){
            System.out.println(" You're normal!");
        }
        else if(bmi < 30){
            System.out.println(" You're overweight!");
        }
        else{
            System.out.println(" You're obese!");
        }
    }
}
