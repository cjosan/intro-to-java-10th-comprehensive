package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise603 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        
        if (isPalindrome(number))
            System.out.println("The number is a palindrome.");
        else
            System.out.println("The number is not a palindrome.");
    }
    
    public static boolean isPalindrome(int number) {
        return (number == reverse(number));
    }
    
    public static int reverse(int number) {
        int reverse = 0;
        while (number > 0) {
            reverse = reverse * 10 + (number % 10);
            number /= 10;
        }
        return reverse;
    }
}
