/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        
        System.out.println("Enter a point coordinates: ");
        x = sc.nextDouble();
        y = sc.nextDouble();
        
        if(x > 0 && y > 0 && x + 2 * y < 200){
            System.out.println("The point is in the triangle!");
        }
        else 
            System.out.println("The point is not in the triabgle!");
    }
}
