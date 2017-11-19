/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Exercise30 {
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
        currentHour = Math.abs((totalHours % 12) + GMT);
        
        if(totalHours % 24 + GMT >= 12)
            System.out.println("The current time is: " + currentHour + ':' + currentMinute + ':' + currentSecond + " PM");
        else
            System.out.println("The current time is: " + currentHour + ':' + currentMinute + ':' + currentSecond + " AM");
    }
}
