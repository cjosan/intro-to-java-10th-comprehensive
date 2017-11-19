package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise707 {
    public static void main(String[] args) {
        int[] integers = new int[100];
        int[] counts = new int[10];
        fillArray(integers);
        countDigits(integers, counts);
        displayCounts(counts);
    }
    
    public static void fillArray(int[] integers) {
        for (int i = 0; i < integers.length; i++) {
            integers[i] = (int)(Math.random() * 10);
        }
    }
    
    public static void countDigits(int[] integers, int[] counts) {
        for (int i = 0; i < integers.length; i++) {
            counts[integers[i]]++;
        }
    }
    
    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            System.out.println("The count for " + i + " is " + counts[i]);
        }
    }
}
