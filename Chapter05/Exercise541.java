package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max, count;
        System.out.println("Enter numbers");
        String numbers = sc.nextLine();
        max = numbers.charAt(0);
        count = 1;
        
        for (int i = 1; i < numbers.length(); i++) {
            if (Character.isDigit(numbers.charAt(i)) && numbers.charAt(i) > max) {
                max = numbers.charAt(i);
                count = 1;
            }
            else if (Character.isDigit(numbers.charAt(i)) && numbers.charAt(i) == max)
                count++;
        }
        
        System.out.println("The largest number is: " + (char)max);
        System.out.println("The occurrence count of the largest number is: " + count);
    }
}
