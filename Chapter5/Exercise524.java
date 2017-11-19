package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise524 {
    public static void main(String[] args) {
        double sum = 0.0;
        
        for (int i = 1, j = 3; j < 100; i++, j += 2) {
            sum += ((double)i / (double)j);
        }
        
        System.out.println(sum);
    }
}
