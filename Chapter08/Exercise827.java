package introjava_iii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise827 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a 3-by-3 matrix row by row");
        double[][] matrix = new double[3][3];
        
        for (double[] i : matrix) {
            for (int j = 0; j < i.length; j++) {
                i[j] = input.nextDouble();
            }
        }
        
        double[][] sortedMatrix = sortColumns(matrix);
        
        System.out.println("The column sorted matrix is");
        displayMatrix(sortedMatrix);
    }
    
    public static double[][] sortColumns(double[][] matrix) {
        double[][] sortedMatrix = new double[matrix.length][matrix.length];
        double[] column = new double [matrix.length];
        double[] sortedColumn;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                column[j] = matrix[j][i];
            }
            
            sortedColumn = sort(column);
            
            for (int k = 0; k < matrix.length; k++) {
                sortedMatrix[k][i] = sortedColumn[k];
            }
        }
        return sortedMatrix;
    }
    
     public static double[] sort(double[] array) {
        int temp;
        
        for (int i = 0; i < array.length; i++) {
            double min = array[i];
            temp = i;
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    temp = j;
                    min = array[j];
                }
            }

            if (temp != i) {
                array[temp] = array[i];
                array[i] = min;
            }
        }
        return array;
    }
    
    public static void displayMatrix(double[][] matrix) {
        for (double[] i : matrix) {
            for (int j = 0; j < i.length; j++) {
                System.out.print(i[j] + "  ");
            }
            System.out.println();
        }
    }
}
