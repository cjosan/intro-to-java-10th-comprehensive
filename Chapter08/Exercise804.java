package introjava_iii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise804 {
    public static void main(String[] args) {
        int[][] employeesHours = initArray();
        int[][] totalHours = new int[employeesHours.length][2];
        
        for (int i = 0; i < employeesHours.length; i++) {
            totalHours[i][0] = i;
            totalHours[i][1] = getTotalHours(employeesHours[i]);
        }
        
        sort(totalHours);
        
        for (int[] hours : totalHours) {
            System.out.println("Employee " + hours[0] + " total hours: " + hours[1]);
        }
    }
    
    public static int[][] initArray() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of employees");
        int number = input.nextInt();
        
        int[][] array = new int[number][7];
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("Employee " + i + " work hours by days: ");
                array[i][j] = input.nextInt();
            }
        }
        System.out.println();
        
        return array;
    }
    
    public static int getTotalHours(int[] hours) {
        int sum = 0;
        for (int i = 0; i < hours.length; i++) {
            sum += hours[i];
        }
        return sum;
    }
    
    public static void sort(int[][] array) {
        int index;
        for (int i = 0; i < array.length - 1; i++) {
            int[] max = array[i];
            index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (max[1] < array[j][1]) {
                    max = array[j];
                    index = j;
                }
            }
            
            if (index != i) {
                array[index] = array[i];
                array[i] = max;
            }
        }
    }
}