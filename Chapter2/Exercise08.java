/*
    (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
    the current time in GMT. Revise the program so that it prompts the user to enter
    the time zone offset to GMT and displays the time in the specified time zone.
 */

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        long totalHours, currentHour, totalMinutes, currentMinute, totalSeconds, currentSecond;
        long totalMilliseconds = System.currentTimeMillis();
        byte GMT;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT:");
        GMT = sc.nextByte();
        
        totalSeconds = totalMilliseconds / 1000;
        currentSecond = totalSeconds % 60;
        totalMinutes = totalSeconds / 60;
        currentMinute = totalMinutes % 60;
        totalHours = totalMinutes / 60;
        currentHour = (totalHours % 24) + GMT;
        
        System.out.println("The current time is: " + currentHour + ':' + currentMinute + ':' + currentSecond + " GMT " + GMT);
    }
}
