package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        long number = sc.nextLong();
        int sum = sumDigits(number);
        System.out.println("The sum of digits is: " + sum);
    }
    
    public static int sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        
        return sum;
    }
}
