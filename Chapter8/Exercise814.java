package introjava_iii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise814 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the size of matrix");
        int size = input.nextInt();
        
        int[][] matrix = new int[size][size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }
        
        displayMatrix(matrix);
        checkRows(matrix);
        checkColumns(matrix);
        checkDiagonals(matrix);
    }
    
    public static void checkRows(int[][] matrix) {
        int oneCount = 0;
        int zeroCount = 0;
        int rowsCount = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1)
                    oneCount++;
                else if (matrix[i][j] == 0)
                    zeroCount++;
            }
            if (oneCount == matrix.length) {
                System.out.println("All 1s on row " + i);
                rowsCount++;
            }
            else if (zeroCount == matrix.length) {
                System.out.println("All 0s on row " + i);
                rowsCount++;
            }
            oneCount = 0;
            zeroCount = 0;
        }
        
        if (rowsCount == 0) {
            System.out.println("No same numbers on a row.");
        }
    }
    
    public static void checkColumns(int[][] matrix) {
        int oneCount = 0;
        int zeroCount = 0;
        int columnsCount = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[j][i] == 1)
                    oneCount++;
                else if (matrix[i][j] == 0)
                    zeroCount++;
            }
            if (oneCount == matrix.length) {
                System.out.println("All 1s on column " + i);
                columnsCount++;
            }
            else if (zeroCount == matrix.length) {
                System.out.println("All 0s on column " + i);
                columnsCount++;
            }
            oneCount = 0;
            zeroCount = 0;
        }
        
        if (columnsCount == 0) {
            System.out.println("No same numbers on a column.");
        }
    }
    
    public static void checkDiagonals(int[][] matrix) {
        int majorOneCount = 0;
        int majorZeroCount = 0;
        int subOneCount = 0;
        int subZeroCount = 0;
        
        int n = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] == 1)
                majorOneCount++;
            else if (matrix[i][i] == 0)
                majorZeroCount++;
            
            if (matrix[i][n] == 1)
                subOneCount++;
            else if (matrix[i][n] == 0)
                subZeroCount++;
            
            n -= 1;
        }
        
        if (majorOneCount == matrix.length)
            System.out.println("All 1s on major diagonal");
        else if (majorZeroCount == matrix.length)
            System.out.println("All 0s on major diagonal");
        else
            System.out.println("No same numbers on the major diagonal");
        
        if (subOneCount == matrix.length)
            System.out.println("All 1s on sub-diagonal");
        else if (subZeroCount == matrix.length)
            System.out.println("All 0s on sub-diagonal");
        else
            System.out.println("No same numbers on the sub-diagonal");
    }
    
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int j = 0; j < row.length; j++) {
                System.out.print(row[j] + " ");
            }
            System.out.println();
        }
    }
}