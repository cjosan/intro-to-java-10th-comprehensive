/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double edge1, edge2, edge3, perimeter;
        
        System.out.println("Enter the 3 edges of the triangle:");
        edge1 = sc.nextDouble();
        edge2 = sc.nextDouble();
        edge3 = sc.nextDouble();
        
        if(isTriangle(edge1, edge2, edge3)){
            perimeter = edge1 + edge2 + edge3;
            System.out.println("The perimter of the triangle is: " + perimeter);
        }
        else
            System.out.println("Edges cannot form a trinagle!");
    }
    
    public boolean isTriangle(double e1, double e2, double e3){
        return (e1 + e2 > e3 && e1 + e3 > e2 && e2 + e3 > e1);
    }
}
