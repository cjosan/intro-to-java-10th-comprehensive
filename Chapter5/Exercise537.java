package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise537 {
    public static void main(String[] args) {
        int decNum;
        String binNum = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in decimal base: ");
        decNum = sc.nextInt();
        int power = 7;
        
        // Short Division by Two with Remainder method
        while (decNum != 0) {
            binNum = (decNum % 2) + binNum;
            decNum /= 2;
        }
        
        System.out.println(binNum);
        
        
        // Descending Powers of Two and Subtraction method
        /* while (decNum > (2 * Math.pow(2, power) - 1))
                power += 8;
        
        while (power >= 0) {
            
            if (decNum - Math.pow(2, power) >= 0) {
                System.out.print(1);
                decNum -= Math.pow(2, power);
            }
            else
                System.out.print(0);
            
            power--;
        }
        
        System.out.println();
        */
    }
}
