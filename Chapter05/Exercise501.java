package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number, positiveCount = 0, negativeCount = 0;
        int sum = 0;
        double average;
        
        do {
            System.out.println("Enter an integer, the input ends if it is 0: ");
            number = sc.nextInt();
            
            if (number > 0)
                positiveCount += 1;
            else if (number < 0)
                negativeCount += 1;
            
            sum += number;
        } while (number != 0);
        
        average = (double)sum / (positiveCount + negativeCount);
        
        if (positiveCount == 0 && negativeCount == 0)
            System.out.println("No numbers are entered except 0");
        else {
            System.out.println("The number of positives is: " + positiveCount);
            System.out.println("The numer of negatives is: " + negativeCount);
            System.out.println("The total is: " + sum + "\nThe average is: " + average);
        }
    }
}
