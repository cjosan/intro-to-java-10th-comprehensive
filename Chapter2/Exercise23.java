/*
    (Cost of driving) Write a program that prompts the user to enter the distance to
    drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
    and displays the cost of the trip.
 */

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        double drivingDistance, fuelEfficiency, gallonPrice, tripCost;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the driving distance:");
        drivingDistance = sc.nextDouble();
        
        System.out.println("Enter miles per gallon:");
        fuelEfficiency = sc.nextDouble();
        
        System.out.println("Enter price per gallon:");
        gallonPrice = sc.nextDouble();
        
        tripCost = (drivingDistance / fuelEfficiency) * gallonPrice;
        System.out.println("The cost of driving is:" + tripCost);
    }
}
