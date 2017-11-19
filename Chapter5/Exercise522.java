package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise522 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double loanAmount, interestRate, monthlyPayment, totalPayment, interest, principal, balance;
        
        System.out.println("Enter the loan amount");
        loanAmount = sc.nextDouble();
        System.out.println("Enter the number of years");
        int yearsNumber = sc.nextInt();
        System.out.println("Enter the annual interest rate");
        interestRate = sc.nextDouble();
        
        monthlyPayment = loanAmount * (interestRate / 1200) / (1 - 1 / Math.pow(1 + interestRate / 1200, yearsNumber * 12));
        balance = loanAmount;
        
        System.out.printf("\nMonthly Payment: %.2f\nTotal Payment: %.2f\n",  + monthlyPayment, (monthlyPayment * 12 * yearsNumber));
        System.out.println("\nPayment#\tInterest\tPrincipal\tBalance");
        
        for (int i = 1; i <= yearsNumber * 12; i++) {
            interest = (interestRate / 1200.0) * balance;
            principal = monthlyPayment - interest;
            balance -= principal;
            
            if (i == yearsNumber * 12 && balance != 0)
                principal += balance;
            
            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", i, interest, principal, balance);
        } 
    }
}
