package introjava_iii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise812 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("(0-single filer, 1-married jointly or " +
        "qualifying widow(er), 2-married separately, 3-head of " +
        "household) Enter the filing status: ");
        int status = input.nextInt();
        
        System.out.print("Enter the taxable income: ");
        int income = input.nextInt();
        
        System.out.println("The tax is: " + computeTax(status, income));
    }
    
    public static double computeTax(int status, int taxableIncome) {
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
            {8350, 33950, 82250, 171550, 372950},  // Single filer
            {16700, 67900, 137050, 20885, 372950}, // Married jointly -or qualifying widow(er)
            {8350, 33950, 68525, 104425, 186475},  // Married separately
            {11950, 45500, 117450, 190200, 372950}}; // Head of household
        
        int index = 0;
        for (int i = 0; i < brackets[status].length; i++) {
            if (taxableIncome <= brackets[status][i]) {
                index = i;
                break;
            }
        }
        System.out.println(index);
        
        if (taxableIncome <= brackets[status][0]) {
            double tax = taxableIncome * rates[0];
            return tax;
        }
        
        double tax = brackets[status][0] * rates[0];
        for (int i = 1; i < index; i++) {
            tax += (brackets[status][i] - brackets[status][i - 1]) * rates[i];
        }
        tax += (taxableIncome - brackets[status][index - 1]) * rates[index];
        
        return tax;
    }
}
