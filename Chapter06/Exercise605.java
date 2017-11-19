package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise605 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        displaySortedNumbers(num1, num2, num3);
    }
    
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double first = num1, second = num2, third = num3;
        if (num1 > num2 && num1 > num3) {
            third = num1;
            if (num2 >= num3) {
                second = num2;
                first = num3;
            }
            else {
                second = num3;
                first = num2;
            }
        }
        else if (num2 > num1 && num2 > num3) {
            third = num2;
            if (num1 >= num3) {
                second = num1;
                first = num3;
            }
            else {
                second = num3;
                first = num1;
            }
        }
        else if (num3 > num1 && num3 > num2) {
            third = num3;
            if (num1 >= num2) {
                second = num1;
                first = num2;
            }
            else {
                second = num2;
                first = num1;
            }
        }
        System.out.println(first + ", " + second + ", " + third);
    }
}
