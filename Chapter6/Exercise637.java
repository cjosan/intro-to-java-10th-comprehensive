package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise637 {
    public static void main(String[] args) {
        System.out.println(format(34, 5));
    }
    
    public static String format(int number, int width) {
        String formattedNumber = Integer.toString(number);
        if (formattedNumber.length() >= width)
            return Integer.toString(number);
        
        while (formattedNumber.length() < width) {
            formattedNumber = "0" + formattedNumber;
        }
        return formattedNumber;
    }
}
