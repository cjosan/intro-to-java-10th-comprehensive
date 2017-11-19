package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise543 {
    public static void main(String[] args) {
        int count = 0;
        
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j > i) {
                    System.out.println("" + i + j);
                    count++;
                }
            }
        }
        System.out.println("The total number of combinations is: " + count);
    }
}
