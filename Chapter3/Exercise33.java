/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double package1Weight, package1Price, package2Weight, package2Price;
        
        System.out.println("Enter weight and price for package 1:");
        package1Weight = sc.nextDouble();
        package1Price = sc.nextDouble();
        System.out.println("Enter weight and price for package 2:");
        package2Weight = sc.nextDouble();
        package2Price = sc.nextDouble();
        
        if(package1Price / package1Weight < package2Price / package2Weight)
            System.out.println("Package 1 has a better price.");
        else if(package1Price / package1Weight > package2Price / package2Weight)
            System.out.println("Package 2 has a better price.");
        else
            System.out.println("Packages have the same price.");
    }
}
