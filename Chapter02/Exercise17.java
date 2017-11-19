/*
     (Science: wind-chill temperature) How cold is it outside? The temperature alone
    is not enough to provide the answer. Other factors including wind speed, relative
    humidity, and sunshine play important roles in determining coldness outside.
    In 2001, the National Weather Service (NWS) implemented the new wind-chill
    temperature to measure the coldness using temperature and wind speed.
    Write a program that prompts the user to enter a temperature between -58 ºF and
    41ºF and a wind speed greater than or equal to 2 and displays the wind-chill temperature.
 */

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        double outsideTemperature, windSpeed, windChillTemperature;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Enter the temperature in Fahrenheit between -58 and 41:");
            outsideTemperature = sc.nextDouble();
        }while(outsideTemperature < -58 && outsideTemperature > 41);  
        
        do{
            System.out.println("Enter the wind speed equal or greater than 2 in miles per hour:");
            windSpeed = sc.nextDouble();
        }while(windSpeed < 2);
        
        windChillTemperature = 35.74 + 0.6215 * outsideTemperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * outsideTemperature * Math.pow(windSpeed, 0.16);
        System.out.println("The wind chill index is: " + windChillTemperature);
    }
}
