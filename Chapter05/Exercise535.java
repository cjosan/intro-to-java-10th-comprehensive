package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise535 {
    public static void main(String[] args) {
        double sum = 0;

        for (int i = 1; i < 625; i++) {
            sum += (1.0 / (i + Math.sqrt(i + 1)));
        }
        
        System.out.println(sum);
    }
}
