package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise549 {
    public static void main(String[] args) {
        int vowelCount = 0, consonantCount = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        
        for (int i = 0; i < str.length(); i++) {
            if (Character.toUpperCase(str.charAt(i)) == 'A' || Character.toUpperCase(str.charAt(i)) == 'E' ||
                    Character.toUpperCase(str.charAt(i)) == 'I' || Character.toUpperCase(str.charAt(i)) == 'O' ||
                    Character.toUpperCase(str.charAt(i)) == 'U') {
                vowelCount++;
            }
            else if (Character.isAlphabetic(str.charAt(i)))
                consonantCount++;
        }
        System.out.println("The number of vowels is: " + vowelCount + "\nThe number of consonants is: " + consonantCount);
    }
}
