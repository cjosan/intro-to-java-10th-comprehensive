package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise732 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter list:");
        int size = input.nextInt();
        
        int[] list = new int[size];
        
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        
        int pivotPosition = partition(list);
        
        for (int e : list)
            System.out.println(e);
        
        System.out.println("The pivot is at position " + pivotPosition);
        
        
    }
    
    public static int partition(int[] list) {
        int[] smaller = new int[0];
        int[] greater = new int[0];
        int pivotPosition;
        int pivot = list[0];
        
        for (int i = 1; i < list.length; i++) {
            if (list[i] <= pivot)
                smaller = add(list[i], smaller);
            else
                greater = add(list[i], greater);
        }
        
        pivotPosition = smaller.length;
        System.arraycopy(smaller, 0, list, 0, smaller.length);
        list[pivotPosition] = pivot;
        System.arraycopy(greater, 0, list, (pivotPosition + 1), greater.length);
        
        return pivotPosition;
    }
    
    public static int[] add(int number, int[] list) {
        int[] newList = new int[list.length + 1];
        System.arraycopy(list, 0, newList, 0, list.length);
        newList[list.length] = number;
        list = newList;
        
        return list;
    }
}
