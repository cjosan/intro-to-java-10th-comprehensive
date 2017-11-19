/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

/**
 *
 * @author admin
 */
public class Exercise06 {
    public static void main(String[] args) {
        double radius = 40.0;
        double x1, y1, x2, y2, x3, y3;
        int alpha, beta, gamma;
        alpha = (int)(Math.random() * 361);
        beta = (int)(Math.random() * 361);
        gamma = (int)(Math.random() * 361);
        
        x1 = radius * Math.cos(Math.toRadians(alpha));
        y1 = radius * Math.sin(Math.toRadians(alpha));
        x2 = radius * Math.cos(Math.toRadians(beta));
        y2 = radius * Math.sin(Math.toRadians(beta));
        x3 = radius * Math.cos(Math.toRadians(gamma));
        y3 = radius * Math.sin(Math.toRadians(gamma));
        
        System.out.println("First point coordinates: (" + x1 + ", " + y1 + ")");
        System.out.println("Second point coordinates: (" + x2 + ", " + y2 + ")");
        System.out.println("Third point coordinates: (" + x3 + ", " + y3 + ")");
    }
}
