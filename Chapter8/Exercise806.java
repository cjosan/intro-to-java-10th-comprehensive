package introjava_iii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise806 {
    public static void main(String[] args) {
        int size = 3;
        System.out.println("Enter matrix 1:");
        double[][] matrix1 = initMatrix(size);
        System.out.println("Enter matrix 2:");
        double[][] matrix2 = initMatrix(size);
        
        double[][] produs = multiplyMatrix(matrix1, matrix2);
        
        System.out.println("The multiplication of matrices is");
        printMatrix(matrix1);
        System.out.println("  *  ");
        printMatrix(matrix2);
        System.out.println(" = ");
        printMatrix(produs);
        
    }
    
    public static double[][] initMatrix(int size) {
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[size][size];
        
        for (double[] row : matrix) {
            for (int j = 0; j < size; j++) {
                row[j] = input.nextDouble();
            }
        }
        return matrix;
    }
    
    public static double[][] multiplyMatrix(double[][] a, double[][] b) {
        double[][] result = new double[b.length][a[0].length];
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = getResult(a[i], getColumn(b, j));
            }
        }
        return result;
    }
    
    public static double[] getColumn(double[][] matrix, int column) {
        double[] array = new double[matrix.length];
        
        for (int i = 0; i < matrix.length; i++) {
            array[i] = matrix[i][column];
        }
        return array;
    }
    
    public static double getResult(double[] row, double[] column) {
        double result = 0;
        for (int i = 0; i < row.length; i++) {
            result += row[i] * column[i];
        }
        return result;
    }
    
    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (int j = 0; j < row.length; j++) {
                System.out.printf("%-6.1f", row[j]);
            }
            System.out.println();
        }
    }
}
