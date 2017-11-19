package introjava_iii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise805 {
    public static void main(String[] args) {
        int size = 3;
        System.out.println("Enter matrix 1:");
        double[][] matrix1 = initMatrix(size);
        System.out.println("Enter matrix 2:");
        double[][] matrix2 = initMatrix(size);
        
        double[][] sum = addMatrix(matrix1, matrix2);
        
        System.out.println("The matrices are added as follows");
        printMatrix(matrix1);
        System.out.println(" + ");
        printMatrix(matrix2);
        System.out.println(" = ");
        printMatrix(sum);
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
    
    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] result = new double[a.length][b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }
    
    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j] + "  ");
            }
            System.out.println();
        }
    }
}
