package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise607 {
    public static void main(String[] args) {
        double investmentAmount, annualInterestRate, monthlyInterestRate, futureInvestmentValue;
        int years;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter investment amount:");
        investmentAmount = sc.nextDouble();
        System.out.println("Enter annual interest rate in percentage:");
        annualInterestRate = sc.nextDouble();
        System.out.println("Enter the number of years:");
        years = sc.nextInt();
        monthlyInterestRate = annualInterestRate / 1200;
        
        System.out.println("Years\tFuture Value");
        for (int i = 1; i <= years; i++) {
            System.out.printf("%d\t\t%.2f\n", i, futureInvestmentValue(investmentAmount, monthlyInterestRate, i));
        }
    }
    
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        return (investmentAmount * Math.pow((1 + monthlyInterestRate), (years * 12)));
    }
}
