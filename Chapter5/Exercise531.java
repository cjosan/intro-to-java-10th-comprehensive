package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise531 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double initialAmount, annualPercentage, monthsNumber, currentAmount;
        
        System.out.print("Enter the initial deposit amount: ");
        initialAmount = sc.nextDouble();
        currentAmount = initialAmount;
        System.out.print("Enter annual percentage yield: ");
        annualPercentage = sc.nextDouble();
        System.out.print("Enter maturity period (number of months): ");
        monthsNumber = sc.nextDouble();
        System.out.println("\nMonth\tCD Value");
        
        for (int i = 1; i <= monthsNumber; i++) {
            currentAmount = currentAmount + (currentAmount * annualPercentage / 1200);
            System.out.printf("%d\t%.2f\n", i, currentAmount);
        }
    }
}
