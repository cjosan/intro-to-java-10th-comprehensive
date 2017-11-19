package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise728 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] integers = new int[10];

        System.out.println("Enter ten integers");

        for (int i = 0; i < integers.length; i++) {
            integers[i] = input.nextInt();
        }
        
        printCombinations(integers);
    }
    
    public static void printCombinations(int[] integers) {
        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers.length; j++) {
                if (integers[i] != integers[j])
                    System.out.println(integers[i] + " " + integers[j]);
            }
        }
    }
}
