package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise613 {
    public static void main(String[] args) {
        System.out.println("i\t\tm(i)\n--------------------------");
        
        for (int i = 1; i <= 20; i++) {
            System.out.printf("%d\t\t%.4f\n", i, computeMi(i));
        }
    }
    
    public static double computeMi(int n) {
        double sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += ((double)i / (i + 1));
        }
        
        return sum;
    }
}
