package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise506 {
    public static void main(String[] args) {
        System.out.println("Miles\t\tKilometers\t|\tKilometers\tMiles");
        
        for (int i = 1, j = 20; i <= 10; i++, j += 5) {
            System.out.printf("%d\t\t%.3f\t\t|\t%d\t\t%.3f\n", i, (i * 1.609), j, (j / 1.609));
        }
    }
}
