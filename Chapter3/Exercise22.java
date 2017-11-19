/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, distance;
        System.out.println("Enter the coordonates of a point: ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        distance = Math.sqrt(Math.pow((x - 0), 2) + Math.pow((y - 0), 2));
        
        if(distance <= 10){
            System.out.println("The point is in the circle");
        }
        else
            System.out.println("The point is not in the circle");
    }
}
