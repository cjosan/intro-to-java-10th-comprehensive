package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise514 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum, secondNum, divisor = 1;
        
        System.out.println("Enter the first number:");
        firstNum = sc.nextInt();
        System.out.println("Enter the second number:");
        secondNum = sc.nextInt();
        
        if (firstNum > secondNum)
            divisor = secondNum;
        else if (firstNum < secondNum)
            divisor = firstNum;
        else {
            System.out.println("The numbers are equal!");
            System.exit(1);
        }
        
        while (divisor != 1) {
            if (firstNum % divisor == 0 && secondNum % divisor == 0) {
                System.out.println("The GCD is: " + divisor);
                break;
            }
            
            divisor -= 1;
        }
    }
}
