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
public class Exercise04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hexagonSide, hexagonArea;
        System.out.println("Enter the length of a hexagon side");
        hexagonSide = sc.nextDouble();
        
        hexagonArea = (6 * Math.pow(hexagonSide, 2)) / (4 * Math.tan(Math.PI / 6));
        System.out.println("The area of the hexagon is: " + hexagonArea);
    }
}
