package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise623 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entera string and a character you want to be counted");
        String str = sc.nextLine();
        char ch = sc.nextLine().charAt(0);
        
        System.out.println("Number of occurences of " + ch + " is equal to " + count(str, ch));
    }
    
    public static int count(String str, char ch) {
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch)
                count++;
        }
        
        return count;
    }
}
