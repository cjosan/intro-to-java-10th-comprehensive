/*
     (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
    to enter the number of years and displays the population after the number of years.
    Use the hint in Programming Exercise 1.11 for this program. The population
    should be cast into an integer.
 */

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        double births, deaths, immigrants, years;
        int population = 312032486;
        double yearsInSeconds;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of years:");
        years = sc.nextDouble();
        yearsInSeconds = years * 365 * 24 * 60 * 60;
        
        births = yearsInSeconds / 7.0;
        deaths = yearsInSeconds / 13.0;
        immigrants = yearsInSeconds / 45.0;
        
        population += (int)(births + immigrants - deaths);
        System.out.println("The population after " + years + " years will be equal to " + population);
    }
}
