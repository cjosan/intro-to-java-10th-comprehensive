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
public class Exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sideNumber;
        double sideLength, polygonArea;
        
        System.out.println("Enter the polygon's number of sides:");
        sideNumber = sc.nextDouble();
        System.out.println("Enter the side of a regular polygon:");
        sideLength = sc.nextDouble();
        
        polygonArea = (sideNumber * Math.pow(sideLength, 2)) / (4 * Math.tan(Math.PI / sideNumber));
        System.out.println("The area of polygon is: " + polygonArea);
    }
}
