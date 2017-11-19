/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, discriminant, root1, root2;
        
        System.out.println("Enter a, b, c:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        discriminant = Math.pow(b, 2.0) - (4 * a * c);
        
        if(discriminant > 0){
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two roots: " + root1 + " and " + root2);
        }
        else if(discriminant == 0){
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has one root: " + root1);
        }
        else{
            System.out.println("The equation has no real roots");
        }
    }
}
