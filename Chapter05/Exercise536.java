package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise536 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        int remainingDigits, length, lastDigit = 0;
        String first9Digits;
            
        do{
            System.out.println("Enter the first 9 integers of an ISBN:");
            first9Digits = sc.nextLine();
            length = first9Digits.length();
        }while(length != 9);
            
        remainingDigits = Integer.parseInt(first9Digits);

        for(int i = 0, j = 9; i < 9; i++, j--){
            lastDigit += (remainingDigits % 10) * j;
            remainingDigits /= 10;
        }
        if((lastDigit %= 11) == 10){
            System.out.println("The ISBN-10 number is : " + first9Digits + "X");
        }
        else{
            System.out.println("The ISBN-10 number is : " + first9Digits + lastDigit);
        } 
    }
}
