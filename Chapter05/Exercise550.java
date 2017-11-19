package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise550 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int upperCount = 0;
        
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
                upperCount++;
        }
        
        System.out.println("The number of uppercase letters is: " + upperCount);
    }
}
