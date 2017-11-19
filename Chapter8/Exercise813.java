package introjava_iii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise813 {
    public static void main(String[] args) {
        double[][] array = initArray();
        int[] largestElementLocation = locateLargest(array);
        
        System.out.println("The location of the largest element is at (" + largestElementLocation[0] + ", " + largestElementLocation[1] + ")");
    }
    
    public static double[][] initArray() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of rows and columns of the array:");
        int rows = input.nextInt();
        int columns = input.nextInt();
        double[][] array = new double[rows][columns];
        
        System.out.println("Enter the array:");
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        return array;
    }
    
    public static int[] locateLargest(double[][] array) {
        double max = array[0][0];
        int[] location = new int[2];
        location[0] = 0;
        location[1] = 1;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }
}
