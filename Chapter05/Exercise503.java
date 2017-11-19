package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise503 {
    public static void main(String[] args) {
        double pounds;
        System.out.println("Kilograms\tPounds");
        for (int i = 1; i < 200; i++) {
            System.out.printf("%d\t\t%.1f\n", i, (i * 2.2));
        }
    }
}
