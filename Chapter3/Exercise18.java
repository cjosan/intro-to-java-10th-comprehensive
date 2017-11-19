/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double packageWeight, shippingCost = 0;
        do{    
            System.out.println("Enter the weight of your package:");
            packageWeight = sc.nextDouble();
        }while(packageWeight < 0)  ;  
        sc.close();
        
        if(packageWeight > 0 && packageWeight <= 1)
            shippingCost = 3.5;
        else if(packageWeight > 1 && packageWeight <= 3)
            shippingCost = 5.5;
        else if(packageWeight > 3 && packageWeight <= 10)
            shippingCost = 8.5;
        else if(packageWeight > 10 && packageWeight <= 20)
            shippingCost = 10.5;
        else
            System.out.println("The package cannot be shipped!");
        
        if(packageWeight > 0 && packageWeight <= 20)
            System.out.println("The cost of shipping your package is: $" + shippingCost);
            
    }
}
