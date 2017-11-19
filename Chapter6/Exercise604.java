package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise604 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        reverse(number);
    }
    
    public static void reverse(int number) {
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10 + (number % 10);
            number /= 10;
        }
        System.out.println(reverse);
    }
}
