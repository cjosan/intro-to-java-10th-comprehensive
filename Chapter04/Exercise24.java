/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Exercise24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cities = new String[3];
        String temp;
        
        System.out.println("Enter the cities names:");
        
        for(int i = 0; i < cities.length; i++){
            cities[i] = sc.nextLine();
        }
        
        boolean count = true;
        while(count){
            count = false;
            for(int i = 0; i < (cities.length - 1); i++){
                if((cities[i + 1].compareTo(cities[i])) < 0){
                    temp = cities[i];
                    cities[i] = cities[i + 1];
                    cities[i + 1] = temp;
                    count = true;
                }
            }
        }
        
        System.out.print("The three cities in alphabetical order are: ");
        for(String city : cities){
            System.out.print(city + " ");
        }
        System.out.println("");
    }
}
