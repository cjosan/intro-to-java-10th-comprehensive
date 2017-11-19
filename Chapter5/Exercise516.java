package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise516 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int divisor = number / 2;

        while (number > 1) {
            if (isPrime(divisor) && number % divisor == 0) {
                number /= divisor;
                System.out.println(divisor);
                continue;
            }
            divisor--;
        }
    }
    
    public boolean isPrime(int n) {
        int div = n / 2;
        while (div > 1) {
            if (n % div == 0)
                return false;
            div--;
        }
        return true;
    }
}
