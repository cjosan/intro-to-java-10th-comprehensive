/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        double x, y, x1, y1, x2, y2, x3, y3, x4, y4;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the coordonates of first point on line 1:");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        System.out.println("Enter the coordonates of second point on line 1:");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        System.out.println("Enter the coordonates of first point on line 2:");
        x3 = sc.nextDouble();
        y3 = sc.nextDouble();
        System.out.println("Enter the coordonates of second point on line 2:");
        x4 = sc.nextDouble();
        y4 = sc.nextDouble();
        
        double a = (y1 - y2);
        double b = (x1 - x2);
        double c = (y3 - y4);
        double d = (x3 - x4);
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        if(a * d - b * c == 0)
            System.out.println("The two lines are parallel!");
        else{
            x = (e * d - b * f) / (a * d - b * c);
            y = (a * f - e * c) / (a * d - b * c);
            System.out.println("The intersecting point is at (" + x + ", " + y + ")");
        }
    }
}
