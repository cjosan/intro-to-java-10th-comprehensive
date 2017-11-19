package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise609 {
    public static void main(String[] args) {
        System.out.println("Feet\tMeters\t|\tMeters\tFeet");
        
        for (int i = 1, j = 20; i <= 10; i++, j += 5) {
            System.out.printf("%d\t%.2f\t|\t%d\t%.2f\n", i, footToMeter(i), j, meterToFoot(j));
        }
    }
    
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }
    
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
}
