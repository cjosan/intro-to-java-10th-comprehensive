package introjava_ii;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise727 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter list1:");
        int size1 = input.nextInt();
        int[] list1 = new int[size1];
        initArray(list1);
        
        System.out.println("Enter list2:");
        int size2 = input.nextInt();
        int[] list2 = new int[size2];
        initArray(list2);
        
        Arrays.sort(list1);
        Arrays.sort(list2);
        
        if (equals(list1, list2))
            System.out.println("The lists are identical");
        else
            System.out.println("The lists are not identical");
    }
    
    public static void initArray(int[] list) {
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
    }
    
    public static boolean equals(int[] list1, int[] list2) {
        int count = 0;
        if (list1.length == list2.length) {
            for (int i = 0; i < list1.length; i++) {
                if (list1[i] != list2[i])
                    count++;
            }
            
            return count == 0;
        }
        else
            return false;
    }
}
