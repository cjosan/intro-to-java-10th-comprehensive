package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise507 {
    public static void main(String[] args) {
        double cost = 0;
        double tuition = 10000;
        
        for (int i = 0; i < 14; i++) {
            tuition *= 1.05;
            
            if (i == 9)
                System.out.printf("The tuition in ten years will be: %.2f\n", tuition);
            
            if (i >= 10)
                cost += tuition;
        }
        
        System.out.printf("The cost of 4 years after ten years will be: %.2f\n", cost);
    }
}
