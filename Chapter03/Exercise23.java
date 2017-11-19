/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        
        System.out.println("Enter the coordonates of a point: ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        
        if(x <= (10 / 2) && y <= 5.0 / 2)
            System.out.println("The point is in the rectangle!");
        else
            System.out.println("The point is not in the rectangle!");
    }
}
