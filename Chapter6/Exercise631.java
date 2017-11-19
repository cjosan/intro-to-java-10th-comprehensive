package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise631 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a card number:");
        long card = sc.nextLong();
        
        if (isValid(card))
            System.out.println(card + " is valid!");
        else
            System.out.println(card + " is invalid");
    }
    
    public static boolean isValid(long number) {
        int size = getSize(number);
        return ((size >= 13 && size <= 16) && (prefixMatched(number, 4) || prefixMatched(number, 5) || 
                prefixMatched(number, 6) || prefixMatched(number, 37)) && ((sumOfOddPlace(number) + sumOfDoubleEvenPlace(number)) % 10 == 0));
    }
    
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        while (number > 0) {
            sum += getDigit((int)((number / 10) % 10) * 2);
            number /= 100;
        }
        return sum;
    }
    
    public static int getDigit(int number) {
        if (number <= 9)
            return number;
        else {
            return ((number % 10) + (number / 10));
        }
    }
    
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        while (number > 0) {
            sum += (number % 10);
            number /= 100;
        }
        return sum;
    }
    
    public static boolean prefixMatched(long number, int d) {
        return (getPrefix(number, getSize(d)) == d);
    }
    
    public static int getSize(long d) {
        return (Long.toString(d).length());
    }
    
    public static long getPrefix(long number, int k) {
        int size = getSize(number);
        
        if (size < k)
            return number;
        else
            return (number / (long)(Math.pow(10, (size - k))));
    }
}
