package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise542 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the commission amount you want to earn: ");
        final int COMMISSION_SOUGHT = sc.nextInt();
        int sales = 0;
        int salary = 5000;
        double remainingMoney;
        
        for (int money = 0; money < COMMISSION_SOUGHT;) {
            sales += 5000;
            
            if (sales > 0 && sales <= 5000)
                money += salary * 1.08;
            else if (sales > 5000 && sales <= 10000)
                money += salary * 1.10;
            else {
                money += salary * 1.12;
            }
            
            if (money > COMMISSION_SOUGHT) {
                sales -= (salary - (money - COMMISSION_SOUGHT)) / 1.12;
            }
        }
        System.out.println("You should make sales in value of: " + sales);
        
    }
}
