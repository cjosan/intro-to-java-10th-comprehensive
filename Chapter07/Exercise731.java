package introjava_ii;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise731 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter list1");
        int size1 = input.nextInt();
        int[] list1 = new int[size1];
        initArray(list1);
        
        System.out.println("Enter list1");
        int size2 = input.nextInt();
        int[] list2 = new int[size2];
        initArray(list2);
        
        Arrays.sort(list1);
        Arrays.sort(list2);
        
        int[] newList;
        
        if (list1.length >= list2.length) {
            newList = merge(list1, list2);
        }
        else
            newList = merge(list2, list1);
        
        for (int e : newList)
            System.out.println(e);
        
    }
    
    public static int[] merge(int[] max, int[] min) {
        int i = 0;
        int j = 0;
        
        int[] mergedList = new int[0];
        
        while (i < max.length || j < min.length) {
            while (j < min.length && i < max.length) {
                if (max[i] > min[j]) {
                    mergedList = add(min[j], mergedList);
                    j++;
                }
                else {
                    mergedList = add(max[i], mergedList);
                    i++;
                }
            }
            if (i < max.length) {
                mergedList = add(max[i], mergedList);
                i++;
            }
            else {
                mergedList = add(min[j], mergedList);
                j++;
            }
        }
        return mergedList;
    }
    
    public static int[] add(int number, int[] list) {
        int[] newList = new int[list.length + 1];
        System.arraycopy(list, 0, newList, 0, list.length);
        newList[list.length] = number;
        list = newList;
        
        return list;
    }
    
    public static void initArray(int[] array) {
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
    }
}
