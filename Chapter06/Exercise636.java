package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise636 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of sides:");
        int sideNumber = sc.nextInt();
        System.out.println("Enter the side:");
        double side = sc.nextDouble();
        
        System.out.println("The area of the polygon is: " + getArea(sideNumber, side));
    }
    
    public static double getArea(int n, double side) {
        return ((5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n)));
    }
}
