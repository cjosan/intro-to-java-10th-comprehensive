package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise709 {
    public static void main(String[] args) {
        double[] numbers = initArray();
        double min = findMin(numbers);
        
        System.out.println("The minimum number is " + min);
    }
    
    public static double[] initArray() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("Enter ten numbers");
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        
        return numbers;
    }
    
    public static double findMin(double[] numbers) {
        double min = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min)
                min = numbers[i];
        }
        
        return min;
    }
}
