package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise621 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string");
        String str = sc.nextLine();
        
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
                System.out.print(getNumber(Character.toUpperCase(str.charAt(i))));
            else
                System.out.print(str.charAt(i));
        }
        
        System.out.println();
    }
    
    public static int getNumber(char uppercaseLetter) {
        switch (uppercaseLetter) {
            case 'A':
            case 'B':
            case 'C':
                return 2;
            case 'D':
            case 'E':
            case 'F':
                return 3;
            case 'G':
            case 'H':
            case 'I':
                return 4;
            case 'J':
            case 'K':
            case 'L':
                return 5;
            case 'M':
            case 'N':
            case 'O':
                return 6;
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                return 7;
            case 'T':
            case 'U':
            case 'V':
                return 8;
            default:
                return 9;
        }
    }
}
