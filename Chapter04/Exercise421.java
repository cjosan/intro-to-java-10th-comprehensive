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
public class Exercise21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.println("Enter a SSN:");
        input = sc.nextLine();
        
        if(input.length() != 11)
            return false;
        
        for(int i = 0; i < input.length(); i++){
            if(i == 3 || i == 6){
                if(!(input.charAt(i) == '-')){
                    System.out.println(input + " is not a valid SSN");
                    return false;
                }
            }
            else{
                if(!(Character.isDigit(input.charAt(i)))){
                System.out.println(input + " is not a valid SSN");
                return false;
                }
            }
        }
        System.out.println(input + " is a valid SSN");
        return true;
    }
}
