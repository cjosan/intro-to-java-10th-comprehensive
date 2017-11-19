package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise718 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[] numbers = new double[10];
        
        System.out.println("Enter 10 numbers");
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        
        bubbleSort(numbers);
        
        for (double n : numbers) {
            System.out.println(n);
        }
    }
    
    public static void bubbleSort(double [] list) {
        double temp;
        int count = -1;
        
        while (count != 0) {
            count = 0;
            
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    count++;
                }
            }
        }
    }
}
