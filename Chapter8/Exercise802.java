package introjava_iii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise802 {
    public static void main(String[] args) {
        double[][] array = initArray();
        
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(array));
    }
    
    public static double[][] initArray() {
        Scanner input = new Scanner(System.in);
        double[][] array = new double[4][4];
        System.out.println("Enter a 4-by-4 matrix row by row:");
        
        for (double[] row : array) {
            for (int j = 0; j < array[0].length; j++) {
                row[j] = input.nextDouble();
            }
        }
        
        return array;
    }
    
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }
}
