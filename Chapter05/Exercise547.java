package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise547 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int checksum = 0;
        String isbn, firstDigits;
        System.out.println("Enter the first 12 digits of an ISBN-13 as a string: ");
        
        do {
            firstDigits = sc.nextLine();
            if (firstDigits.length() != 12)
                System.out.println(firstDigits + " is an invalid input");
        } while (firstDigits.length() != 12);
        
        for (int i = 0; i < firstDigits.length(); i++) {
            if (i % 2 == 0) 
                checksum += Character.getNumericValue(firstDigits.charAt(i));
            else
                checksum += 3 * Character.getNumericValue(firstDigits.charAt(i));
        }
        
        checksum = 10 - checksum % 10;
        
        System.out.print(firstDigits);
        
        if (checksum == 10)
            System.out.println(0);
        else
            System.out.println(checksum);
        
    }
}
