package introjava_iii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise819 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int rows = input.nextInt();
        int columns = input.nextInt();
        int[][] matrix = new int[rows][columns];
        
        System.out.println("Enter the values in matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        
        if (rows > 3 && columns > 3)
            System.out.println(checkRows(matrix) || checkColumns(matrix) || checkDiagonals(matrix));
    }
    
    public static boolean checkRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 3; j++) {
                if (matrix[i][j] == matrix[i][j + 1] && matrix[i][j] == matrix[i][j + 2] && matrix[i][j] == matrix[i][j + 3])
                    return true;
            }
        }
        return false;
    }
    
    public static boolean checkColumns(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length - 3; j++) {
                if (matrix[j][i] == matrix[j + 1][i] && matrix[j][i] == matrix[j + 2][i] && matrix[j][i] == matrix[j + 3][i])
                    return true;
            }
        }
        return false;
    }
    
    public static boolean checkDiagonals(int[][] matrix) {
        for (int i = 0; i < matrix.length - 3; i++) {
            for (int j = 0; j < matrix[i].length - 3; j++) {
                if (matrix[i][j] == matrix[i + 1][j + 1] && matrix[i][j] == matrix[i + 2][j + 2] && matrix[i][j] == matrix[i + 3][j + 3])
                    return true;
                
                if (matrix[i][j + 1] == matrix[i + 1][j + 2] && matrix[i][j + 1] == matrix[i + 2][j + 3] && matrix[i][j + 1] == matrix[i + 3][j + 4])
                    return true;
            }
        }
        
        for (int i = 0; i < matrix.length - 3; i++) {
            for (int j = matrix[i].length - 1; j > 3; j--) {
                if (matrix[i][j] == matrix[i + 1][j - 1] && matrix[i][j] == matrix[i + 2][j - 2] && matrix[i][j] == matrix[i + 3][j - 3])
                    return true;
                
                if (matrix[i][j - 1] == matrix[i + 1][j - 2] && matrix[i][j] == matrix[i + 2][j - 3] && matrix[i][j] == matrix[i + 3][j - 4])
                    return true;
            }
        }
        return false;
    }
}
