package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise730 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the size of series");
        int size = input.nextInt();
        int[] series = new int[size];
        
        System.out.println("Enter the values");
        
        for (int i = 0; i < size; i++) {
            series[i] = input.nextInt();
        }
        
        if (hasFourConsecutives(series))
            System.out.println("The list has consecutive fours");
        else
            System.out.println("The list has no consecutive fours");
    }
    
    public static boolean hasFourConsecutives(int[] list) {
        for (int i = 0; i < (list.length - 3); i++) {
            if (list[i] == list[i + 1] && list[i] == list[i + 2] && list[i] == list[i + 3])
                return true;
        }
        return false;
    }
}
