package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise710 {
    public static void main(String[] args) {
        double[] numbers = {1.9, 2.5, 3.7, 2, 1.5, 6, 3, 4, 5, 2};
        
        System.out.println("The index of minimum nuber is " + indexOfSmallestElement(numbers));
        
    }
    
    public static int indexOfSmallestElement(double[] array) {
        double min = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
