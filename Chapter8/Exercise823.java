package introjava_iii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise823 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        initMatrix(matrix);
        displayMatrix(matrix);
        
        int row = checkRows(matrix);
        int column = checkColumns(matrix);
        
        if (row >= 0 && column >= 0)
            System.out.println("The flipped cell is at (" + row + ", " + column + ")");
        else
            System.out.println("There is no flipped cell");
    }
    
    public static void initMatrix(int[][] matrix) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a 6-by-6 matrix");
        for (int[] row : matrix) {
            for (int j = 0; j < row.length; j++) {
                row[j] = input.nextInt();
            }
        }
    }
    
    public static int checkRows(int[][] matrix) {
        int count = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1)
                    count++;
            }
            
            if (count % 2 != 0)
                return i;
        
            count = 0;
        }
        return -1;
    }
    
    public static int checkColumns(int[][] matrix) {
        int count = 0;
        
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1)
                    count++;
            }
            
            if (count % 2 != 0)
                return i;
        }
        return -1;
    }
    
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
