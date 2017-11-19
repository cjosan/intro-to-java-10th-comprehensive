package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise708 {
    public static void main(String[] args) {
        int[] integerArray = {1, 2, 3, 4, 5};
        double[] doubleArray = {1.5, 2.4, 3.3, 4.2, 5.1};
        
        System.out.println(average(integerArray));
        System.out.println(average(doubleArray));
    }
    
    public static int average(int[] array) {
        int sum = 0;
        
        for (int number : array) {
            sum += number;
        }
        return (sum / array.length);
    }
    
    public static double average(double[] array) {
        double sum = 0;
        
        for (double number : array) {
            sum += number;
        }
        return (sum / array.length);
    }
}
