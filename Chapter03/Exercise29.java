/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

public class Exercise29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, y1, r1, x2, y2, r2;
        
        System.out.println("Enter the coordinates of first circle's centre and its radii:");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        r1 = sc.nextDouble();
        System.out.println("Enter the coordinates of second circle's centre and its radii:");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        r2 = sc.nextDouble();
        
        if(Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)) <= Math.abs(r1 - r2))
            System.out.println("Second circle is inside first circle!");
        else if(Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2)) <= (r1 + r2))
            System.out.println("Second circle overlaps first circle!");
        else
            System.out.println("Second circle does not overlap first circle!");
        
    }
}
