package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise539 {
    public static void main(String[] args) {
        int money = 0;
        int sales = 0;
        int salary = 5000;
        
        do {
            sales += 5000;
            
            if (sales > 0 && sales <= 5000)
                money += salary * 1.08;
            else if (sales > 5000 && sales <= 10000)
                money += salary * 1.10;
            else {
                money += salary * 1.12;
            }
            
            if (money > 30000)
                sales -= (salary - (money - 30000)) / 1.12;
            
        } while (money < 30000);
        
        System.out.println("You should make sales in value of: " + sales);
        
    }
}
