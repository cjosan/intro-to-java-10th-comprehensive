/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int today, elapsedDays;
        
        do{
            System.out.println("Enter today's day:");
            today = sc.nextInt();
        }while(today < 0 || today > 6);
        
        System.out.println("Enter the number of days elapsed since today:");
        elapsedDays = sc.nextInt();
        
        System.out.println("Today is " + findDay(today) + " and the future day is " + findDay((today + elapsedDays) % 7));
        
    }
    
    private String findDay(int dayNumber){
        switch(dayNumber){
            case 0: return "Sunday";
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 6: return "Saturday";
        }
        return "Wrong number of day!";
    }
}
