package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int guess, firstDigit, lastDigit;
        
        firstDigit = (int)(Math.random() * 10);
        
        do {
            lastDigit = (int)(Math.random() * 10);
        } while (lastDigit == firstDigit);
        System.out.println(firstDigit + "" + lastDigit);
        
        do {
            System.out.println("Enter your guess (2 digits):");
            guess = sc.nextInt();
        } while (guess < 0 || guess > 99);
        
        if (Integer.toString(guess).equals("" + firstDigit + lastDigit))
            System.out.println("You won 10000$");
        else if (guess / 10 == lastDigit && guess % 10 == firstDigit)
            System.out.println("You won 3000$");
        else if (guess / 10 == firstDigit || guess / 10 == lastDigit || guess % 10 == firstDigit || guess % 10 == lastDigit)
            System.out.println("You won 1000$");
        else
            System.out.println("You lost");
    }
}
