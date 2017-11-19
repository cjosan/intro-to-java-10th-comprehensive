package introjava_ii;

import java.util.Arrays;

/**
 *
 * @author Cornel Josan
 */
public class Exercise716 {
    public static void main(String[] args) {
        int[] numbers = new int[100000];
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 10);
        }
        
        int key = (int)(Math.random() * 10);
        
        long startTime = System.currentTimeMillis();
        linearSearch(numbers, key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time of linear search is " + executionTime);
        
        selectionSort(numbers);
        
        startTime = System.currentTimeMillis();
        binarySearch(numbers, key);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution time of binary search is " + executionTime);
    }
    
    public static void selectionSort(int[] list) {
	int temp;
	for (int i = 0; i < list.length; i++) {
            int min = list[i];
            temp = i;
            for (int j = i + 1; j < list.length; j++) {
		if (min > list[j]) {
                    temp = j;
                    min = list[j];
		}
            }

            if (temp != i) {
		list[temp] = list[i];
		list[i] = min;
            }
	}
    }
    
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
            return i;
        }
        return -1;
    }
    
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }

        return -low - 1;
    }
}
