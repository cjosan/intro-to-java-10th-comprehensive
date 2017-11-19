/*
    (Physics: finding runway length) Given an airplane’s acceleration a and take-off
    speed v, you can compute the minimum runway length needed for an airplane to
    take off using the following formula:
    length = v2 / 2a
    Write a program that prompts the user to enter v in meters/second (m/s) and the
    acceleration a in meters/second squared (m/s2), and displays the minimum runway
    length.
 */

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        double airplaneSpeed, airplaneAcceleration, runwayLength;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the speed in m/s and acceleration in m/s^2 of the airplane:");
        airplaneSpeed = sc.nextDouble();
        airplaneAcceleration = sc.nextDouble();
        
        runwayLength = Math.pow(airplaneSpeed, 2) / (2 * airplaneAcceleration);
        runwayLength = (int)(runwayLength * 100) / 100.0; // Shows 2 decimal digits
        System.out.println("The minimum runway length for this airplane is: " + runwayLength);
    }
}
