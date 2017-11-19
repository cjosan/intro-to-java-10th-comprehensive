package introjava_iii;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise836 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number n");
        int n = Integer.parseInt(input.nextLine());
        char[] letters = new char[n];
        char[][] matrix = new char[n][n];
        
        for (int i = 0; i < n; i++) {
            letters[i] = (char)(i + 'A');
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextLine().charAt(0);
                if (!search(letters, matrix[i][j])) {
                    System.out.println("Wrong input: the letters must be from " + letters[0] + letters[n - 1]);
                    System.exit(1);
                }
            }
        }
        
        if (checkRows(matrix, letters) && checkColumns(matrix, letters))
            System.out.println("The input array is a Latin square");
        else
            System.out.println("The input array is not a Latin square");
    }
    
    public static boolean checkRows(char[][] matrix, char[] letters) {
        char[] row = new char[matrix.length];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                row[j] = matrix[i][j];
            }
            
            Arrays.sort(row);
            if (!equals(row, letters))
                return false;
        }
        return true;
    }
    
    public static boolean checkColumns(char[][] matrix, char[] letters) {
        char[] column = new char[matrix.length];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                column[j] = matrix[j][i];
            }
            
            Arrays.sort(column);
            
            if (!equals(column, letters))
                return false;
        }
        return true;
    }
    
    public static boolean equals(char[] m1, char[] m2) {
        for (int i = 0; i < m1.length; i++) {
            if (m1[i] != m2[i])
                return false;
        }
        return true;
    }
    
    public boolean search(char[] letters, char ch) {
        for (int letter : letters) {
            if (ch == letter)
                return true;
        }
        return false;
    }
}
