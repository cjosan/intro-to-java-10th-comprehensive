package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        
        System.out.println("Enter ten integers");
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        
        reverse(numbers);
        
        for (int n : numbers) {
            System.out.println(n);
        }
    }
    
    public static void reverse(int[] array) {
        int temp;
        int n = array.length - 1;
        
        for (int i = 0; i < (array.length / 2); i++) {
            temp = array[i];
            array[i] = array[i + n];
            array[i + n] = temp;
            n -= 2;
        }
    }
}
