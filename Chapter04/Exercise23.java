/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Exercise23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee's name:");
        String name = sc.nextLine();
        System.out.println("Enter number of hours worked in a week:");
        int hours = sc.nextInt();
        System.out.println("Enter hourly pay rate:");
        double payRate = sc.nextDouble();
        System.out.println("Enter federal tax withholding rate:");
        double federalTax = sc.nextDouble();
        System.out.println("Enter state tax withholding rate:");
        double stateTax = sc.nextDouble();
        
        System.out.println("Employee name:" + name);
        System.out.println("Hours worked:" + hours);
        System.out.println("Pay Rate: $" + payRate);
        System.out.println("Gross pay: $" + hours * payRate);
        System.out.println("Deductions:\n\tFederal Withholding (" + federalTax * 100.0 + "%): " + (hours * payRate * federalTax));
        System.out.println("\tState Witholding (" + stateTax * 100.0 + "%): " + (hours * payRate * stateTax));
        System.out.println("\tTotal Deduction: $" + ((hours * payRate * federalTax) + (hours * payRate * stateTax)));
        System.out.println("Net Pay: " + (hours * payRate - ((hours * payRate * federalTax) + (hours * payRate * stateTax))));
    }
}
