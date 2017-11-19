/*
    (Health application: computing BMI) Body Mass Index (BMI) is a measure of
    health on weight. It can be calculated by taking your weight in kilograms and
    dividing by the square of your height in meters. Write a program that prompts the
    user to enter a weight in pounds and height in inches and displays the BMI. Note
    that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
 */

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        double weight, height, BMI;
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter weight in pounds:");
        weight = sc.nextDouble();
        System.out.println("Enter height in inches:");
        height = sc.nextDouble();
 
        BMI = poundsToKillograms(weight) / Math.pow(inchesToMeters(height), 2);
        System.out.println(poundsToKillograms(weight));
        System.out.println(inchesToMeters(height));
        System.out.println("The BMI is:" + BMI);
    }
    
    private double poundsToKillograms(double weight){
        double pound = 0.45359237;
        return (weight *= pound);
    }
    
    private double inchesToMeters(double height){
        double inch = 0.0254;
        return(height *= inch);
    }
}
