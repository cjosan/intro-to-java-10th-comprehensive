package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string");
        String str = sc.nextLine();
        
        System.out.println("The string has " + countLetters(str) + " letters");
    }
    
    public static int countLetters(String str) {
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
                count++;
        }
        
        return count;
    }
}
