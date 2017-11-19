package introjava_iii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise817 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of banks");
        int banksNumber = input.nextInt();
        double[][] banks = new double[banksNumber][];
        double[][] borrowers = new double[banksNumber][banksNumber];
        int[] unsafeBanks = new int[banks.length];
        
        System.out.println("Enter the limit for bank safety");
        double limit = input.nextDouble();
        
        getInformation(borrowers, banks);

        for (int i = 0; i < banks.length; i++) {
            isSafe(borrowers, i, banks[i][0], limit);
        }
        
        for (int i = 0; i < banks.length; i++) {
            if (!isSafe(borrowers, i, banks[i][0], limit))
                unsafeBanks[i]++;
        }
        
        System.out.print("\nUnsafe banks are: ");
        for (int i = 0; i < unsafeBanks.length; i++) {
            if (unsafeBanks[i] > 0)
                System.out.print(i + " ");
        }
        System.out.println();  
    }
    
    public static void getInformation(double[][] borrowers, double[][] banks) {
        Scanner input = new Scanner(System.in);
        double balance;
        int numberOfBorrowers;
        
        for (int i = 0; i < banks.length; i++) {
            System.out.println("Enter the balance and number of borrowers for bank " + i);
            balance = input.nextDouble();
            numberOfBorrowers = input.nextInt();
            banks[i] = new double[numberOfBorrowers * 2 + 2];
            banks[i][0] = balance;
            banks[i][1] = numberOfBorrowers;
            
            System.out.println("Enter the id of borrowers and loans:");
            
            for (int j = 2; j < banks[i].length; j += 2) {
                banks[i][j] = input.nextDouble();
                banks[i][j + 1] = input.nextDouble();
                borrowers[i][(int)banks[i][j]] = banks[i][j + 1];
            }
        }
    }
    
    public static boolean isSafe(double[][] borrowers, int bank, double balance, double limit) {
        double total = balance;
        for (int i = 0; i < borrowers[bank].length; i++) {
            total += borrowers[bank][i];
        }
        
        if (total < limit) {
            for (int i = 0; i < borrowers.length; i++) {
                borrowers[i][bank] = 0;
            }
            return false;
        }
        return true;
    }
}
