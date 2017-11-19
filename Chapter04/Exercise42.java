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
public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double latitude1, latitude2, longitude1, longitude2, distance;
        double radius = 6371.01;
        
        System.out.println("Enter point 1 (latitude and longitude) in degrees:");
        latitude1 = Math.toRadians(sc.nextDouble());
        longitude1 = Math.toRadians(sc.nextDouble());
        System.out.println("Enter point 2 (latitude and longitude) in degrees:");
        latitude2 = Math.toRadians(sc.nextDouble());
        longitude2 = Math.toRadians(sc.nextDouble());
        
        distance = radius * Math.acos(Math.sin(latitude1) * Math.sin(latitude2) + 
                Math.cos(latitude1) * Math.cos(latitude2) * 
                        Math.cos(longitude1 - longitude2));
        
        System.out.println("The distance between two points is: " + distance + " km");
    }
}
