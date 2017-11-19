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
public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length, sideLength, area;
        
        System.out.println("Enter the length from the center to a vertex:");
        length = sc.nextDouble();
        
        sideLength = 2 * length * Math.sin(Math.PI / 5);
        area = (5 * Math.pow(sideLength, 2) / (4 * Math.tan(Math.PI / 5)));
        System.out.printf("The area is: %.2f\n", area);
    }    
}
