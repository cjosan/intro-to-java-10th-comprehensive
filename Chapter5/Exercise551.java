package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise551 {
    public static void main(String[] args) {
        String firstString, secondString;
        String prefix = "";
        int shortest;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first string:");
        firstString = sc.nextLine();
        System.out.println("Enter the first string:");
        secondString = sc.nextLine();
        
        if (firstString.equals(secondString)) {
            System.out.println("Strings are equal");
            System.exit(0);
        }
        
        if (firstString.length() > secondString.length())
            shortest = secondString.length();
        else
            shortest = firstString.length();
        
        for (int i = 0; i < shortest; i++) {
            if (firstString.charAt(i) == secondString.charAt(i))
                prefix += firstString.charAt(i);
            else
                break;
        }
        
        if (prefix.isEmpty())
            System.out.println(firstString + " and " + secondString + " have no common prefix");
        else
            System.out.println("The common prefix is: " + prefix);
    }
}
