package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise523 {
    public static void main(String[] args) {
        double sumLR = 0, sumRL = 0;
        
        for (int i = 1; i <= 50000; i++) {
            sumLR += (1.0 / i);
        }
        
        for (int i = 50000; i > 0; i--) {
            sumRL += (1.0 / i);
        }
        
        System.out.println("Left to rigth sum: " + sumLR + "\nRight to left sum: " + sumRL);
    }
}
