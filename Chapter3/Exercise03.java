/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, d, e, f, x, y;
        
        System.out.println("Enter a, b, c, e, f:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();
        e = sc.nextDouble();
        f = sc.nextDouble();
        
        if((a * d - b * c) == 0){
            System.out.println("The equation has no solution!");
        }
        else{
            x = (e * d - b * f) / (a * d - b * c);
            y = (a * f - e * c) / (a * d - b * c);
            System.out.println("The x is " + x + " and y is " + y);
        }
    }
}
