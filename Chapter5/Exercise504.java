package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise504 {
    public static void main(String[] args) {
        System.out.println("Miles\tKilometers");
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d\t%.3f\n", i, (i * 1.609));
        }
    }
}
