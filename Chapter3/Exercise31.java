/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

public class Exercise31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double USdollars, chineseRMB, exchangeRate, moneyAmount;
        byte option;
        
        System.out.println("Enter the exchange rate from dollars to RMB:");
        exchangeRate = sc.nextDouble();
        System.out.println("- For US to RMB press 0;\n" + "- For RMB to US press 1");
        option = sc.nextByte();

        switch(option){
            case 0:
                System.out.println("Enter the dollar amount:");
                USdollars = sc.nextDouble();
                System.out.println("$" + USdollars + " is " + (USdollars * exchangeRate) + " yuan");
                break;
            case 1:
                System.out.println("Enter the RMB amount:");
                chineseRMB = sc.nextDouble();
                System.out.println(chineseRMB + " yuan is $" + chineseRMB / exchangeRate);
                break;
            default:
                System.out.println("You choosed a wrong exchange option! Please try again.");
        }
    }
}
