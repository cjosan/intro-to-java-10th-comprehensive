/*
    (Find the number of years) Write a program that prompts the user to enter the
    minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
    For simplicity, assume a year has 365 days.
 */

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        int minutes, years, days, remainingMinutes;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of minutes:");
        minutes = sc.nextInt();
        years = minutes / (365 * 24 * 60);
        remainingMinutes = minutes % (365 * 24 * 60);
        days = remainingMinutes / (24 * 60);
        
        System.out.println(minutes + " minutes is aproximately " + years + " years and " + days + " days");
    }
}
