package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise611 {
    public static void main(String[] args) {
        System.out.println("Sales Amount\tCommission");
        
        for (int i = 10000; i <= 100000; i += 5000) {
            System.out.println(i + "\t\t" + computeCommission(i));
        }
    }
    
    public static double computeCommission(double salesAmount) {
            return (5000 * 0.08 + 5000 * 0.1 + (salesAmount - 10000) * 0.12);
    }
}
