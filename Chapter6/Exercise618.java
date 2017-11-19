package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise618 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a password:");
        String password = sc.nextLine();
        
        if (isValidPassword(password))
            System.out.println("It is a valid password!");
        else
            System.out.println("It is an invalid password!");
    }
    
    public static boolean isValidPassword(String password) {
       return ((password.length() >= 8) && isRightFormatted(password));
    }
    
    public static boolean isRightFormatted(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetterOrDigit(str.charAt(i)))
                return false;
            
            if (Character.isDigit(str.charAt(i)))
                count++;
        }
        
        return ((count >= 2 && count != str.length()));
    }
}
