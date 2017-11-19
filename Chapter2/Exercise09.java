/*
    (Physics: acceleration) Average acceleration is defined as the change of velocity
    divided by the time taken to make the change, as shown in the following formula:
    a = (v1 - v0) / t
    Write a program that prompts the user to enter the starting velocity v0 in meters/
    second, the ending velocity v1 in meters/second, and the time span t in seconds,
    and displays the average acceleration.
 */

import java.util.Scanner;

public class Exercise09 {
   public static void main(String[] args) {
        double startingVelocity, endingVelocity, time, averageAcceleration;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the starting velocity and ending velocity in m/s and the time in s:");
        startingVelocity = sc.nextDouble();
        endingVelocity = sc.nextDouble();
        time = sc.nextDouble();
        
        averageAcceleration = (endingVelocity - startingVelocity) / time;
        System.out.format("The average acceleration is: %.4f\n", averageAcceleration);
    }
}
