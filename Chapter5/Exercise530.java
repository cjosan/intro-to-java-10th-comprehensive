package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise530 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount, annualRate;
        double savings = 0;
        int monthsNumber;
        
        System.out.print("Enter the initial deposit amount: ");
        amount = sc.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        annualRate = sc.nextDouble();
        System.out.println("Enter maturity period (number of months): ");
        monthsNumber = sc.nextInt();
        
        for (int i = 1; i <= monthsNumber; i++) {
            savings = (amount + savings) * (1 + annualRate / 1200);
            System.out.printf("%d month: %.2f\n", i, savings);
        }
    }
}
