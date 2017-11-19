package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise614 {
    public static void main(String[] args) {
        System.out.println("i\t\tm(i)");
        
        for (int i = 1; i <= 901; i += 100) {
            System.out.printf("%d\t\t%.4f\n", i, estimatePi(i));
        }
    }
    
    public static double estimatePi(int n) {
        double sum = 0d;
        
        for (int i = 1; i <= n; i++) {
            sum += (Math.pow(-1, (i + 1)) / (2 * i - 1));
        }
        
        return 4 * sum;
    }
}
