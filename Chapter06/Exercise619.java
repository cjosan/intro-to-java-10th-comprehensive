package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise619 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three side of a tringle:");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        
        if (isValid(side1, side2, side3))
            System.out.println("The area of the triangle is " + computeArea(side1, side2, side3));
        else
            System.out.println("The input is invalid!");
    }
    
    public static boolean isValid(double side1, double side2, double side3) {
        return ((side1 < (side2 + side3)) && (side2 < (side1 + side3)) && (side3 < (side1 + side2)));
    }
    
    public static double computeArea(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        
        return Math.sqrt((perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3)));
    }
}
