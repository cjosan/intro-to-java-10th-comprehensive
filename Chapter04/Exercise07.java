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
public class Exercise07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x0, y0, x1, y1, x2, y2, x3, y3, x4, y4;
        double radius;
        int alpha, beta, gamma, teta, epsilon;
        System.out.println("Enter the radius of the bounding circle:");
        radius = sc.nextDouble();
        alpha = (int)(Math.random() * 361);
        beta = (int)(Math.random() * 361);
        gamma = (int)(Math.random() * 361);
        teta = (int)(Math.random() * 361);
        epsilon = (int)(Math.random() * 361);
        
        x0 = 0;
        y0 = radius * Math.sin(Math.toRadians(alpha));
        x1 = radius * Math.cos(Math.toRadians(beta));
        y1 = radius * Math.sin(Math.toRadians(beta));
        x2 = radius * Math.cos(Math.toRadians(gamma));
        y2 = radius * Math.sin(Math.toRadians(gamma));
        x3 = radius * Math.cos(Math.toRadians(teta));
        y3 = radius * Math.sin(Math.toRadians(teta));
        x4 = radius * Math.cos(Math.toRadians(epsilon));
        y4 = radius * Math.sin(Math.toRadians(epsilon));
        
        System.out.println("The position of five points on the pentagon are:");
        System.out.println("(" + x0 + ", " + y0 + ")");
        System.out.println("(" + x1 + ", " + y1 + ")");
        System.out.println("(" + x2 + ", " + y2 + ")");
        System.out.println("(" + x3 + ", " + y3 + ")");
        System.out.println("(" + x4 + ", " + y4 + ")");
        
    }
}
