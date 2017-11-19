package introjava_ii;

import java.util.Scanner;
/**
 *
 * @author Cornel Josan
 */
public class Exercise521 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double interestRate = 5.0;
        System.out.println("Enter the loan amount:");
        double loanAmount = sc.nextDouble();
        System.out.println("Enter the number of years:");
        int yearsNumber = sc.nextInt();
        double monthlyPayment;
        
        System.out.println("Interest rate\tMonthly payment\tTotalPayment");
        
        while (interestRate <= 8.0) {
            monthlyPayment = loanAmount * (interestRate / 1200) / (1 - 1 / Math.pow(1 + interestRate / 1200, yearsNumber * 12));
            System.out.printf("%.3f%%\t\t%.2f\t\t%.2f\n", interestRate, monthlyPayment, (monthlyPayment * 12 * yearsNumber));
            interestRate += 0.125;
        }
    }
}
