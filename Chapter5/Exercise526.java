package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise526 {
    public static void main(String[] args) {
        double e = 1;
        double factorial = 1;
        
        for (int j = 10000; j <= 100000; j += 10000) {
            for (int i = 1; i <= j; i++) {
                factorial *= i;
                e += (1.0 / factorial);
            }
            System.out.println(e);
            e = 1;
            factorial = 1;
        }
    }
}
