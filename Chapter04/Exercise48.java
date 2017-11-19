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
public class Exercise08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte code;
        System.out.println("Enter an ASCII code:");
        code = sc.nextByte();
        System.out.println("The character for ASCII code " + code + " is " + (char)code);
    }
}
