/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, y1, width1, height1, x2, y2, width2, height2;
        
        System.out.println("Enter the center coordinates, width and height of first rectangle");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        width1 = sc.nextDouble();
        height1 = sc.nextDouble();
        
        System.out.println("Enter the center coordinates, width and height of second rectangle");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        width2 = sc.nextDouble();
        height2 = sc.nextDouble();
        
        // Check if difference between sides is greater or equal to difference between centers
        if((width1 - width2) >= Math.abs(x1 - x2) && (height1 - height2) >= (y1 - y2)){
            System.out.println("Second rectangle is indide first rectangle!");
        }
        // Check if the sum of halves of sides is smaller then difference between centers
        else if((width1 / 2 + width2 / 2) < Math.abs(x1 - x2) || (height1 / 2 + height2 / 2) < Math.abs(y1 - y2)){
            System.out.println("Second rectangle does not overlap first rectangle!");
        }
        else{
            System.out.println("Second rectangle overlaps first rectangle!");
        }
    }
}
