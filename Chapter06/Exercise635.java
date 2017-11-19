package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise635 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side:");
        double side = sc.nextDouble();
        
        System.out.println("The area of the pentagon is " + getArea(side));
    }
    
    public static double getArea(double side) {
        return ((5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5)));
    }
}
