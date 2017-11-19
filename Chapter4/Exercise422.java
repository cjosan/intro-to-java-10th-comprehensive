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
public class Exercise22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        System.out.println("Enter string 1:");
        s1 = sc.nextLine();
        System.out.println("Enter string 2:");
        s2 = sc.nextLine();
        
        if(s1.contains(s2))
            System.out.println(s2 + " is a substring of " + s1);
        else
            System.out.println(s2 + " is not a substring of " + s1);
    }
}
