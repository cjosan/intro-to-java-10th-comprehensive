/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayOfMonth, month, year, century, yearOfCentury;
        
        System.out.println("Enter year(e.g. 2012): ");
        year = sc.nextInt();
        century = year / 100;
        yearOfCentury = year % 100;
        System.out.println("Enter month (1-12): ");
        month = sc.nextInt();
        if(month == 1 || month == 2){
            month += 12;
            year--;
        }
        System.out.println("Enter the day of month (1-31):");
        dayOfMonth = sc.nextInt();
        
        int dayOfWeek = (dayOfMonth + ((26 * (month + 1)) / 10) + yearOfCentury + (yearOfCentury / 4) + (6 * yearOfCentury / 100) + (yearOfCentury / 400) - 1) % 7;
        System.out.println("Day of the week is " + findNameOfDay(dayOfWeek));
        System.out.println("Day of the week is " + dayOfWeek);
    }
    
    public String findNameOfDay(int day){
        switch(day){
            case 0:
                return "Saturday";
            case 1: 
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
        }
        return "***Cannot find the day!***";
    }
}
