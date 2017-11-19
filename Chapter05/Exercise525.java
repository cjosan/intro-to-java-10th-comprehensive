package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise525 {
    public static void main(String[] args) {
        double pi = 0;
        
        for (int j = 10000; j <= 100000; j += 10000) {
            for (int i = 1; i < (2 * j - 1); i += 1) {
                pi += Math.pow(-1, i + 1) / (2 * i - 1); 
            }

            System.out.println(4.0 * pi);
            pi = 0;
        }
    }
}
