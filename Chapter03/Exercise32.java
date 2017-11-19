/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x0, y0, x1, y1, x2, y2;
        
        System.out.println("Enter the coordinates for three points p0, p1 and p2:");
        x0 = sc.nextDouble();
        y0 = sc.nextDouble();
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        
        if((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) > 0)
            System.out.println("(" + x2 + ", " + y2 + ") is on the left side of the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")"); 
        else if((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) < 0)
            System.out.println("(" + x2 + ", " + y2 + ") is on the right side of the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        else
            System.out.println("(" + x2 + ", " + y2 + ") is on the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
    }
}
