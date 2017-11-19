package introjava_iii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise811 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number between 0 and 511");
        int number = input.nextInt();
        
        int[][] matrix = toBinary(number);
        displayMatrix(matrix);
    }
    
    public static int[][] toBinary(int number) {
        int[][] binaryNumber = new int[3][3];
        
            for (int i = binaryNumber.length - 1; i >= 0; i--) {
                for (int j = binaryNumber[i].length - 1; j >= 0; j--) {
                    if (number != 0) {
                        binaryNumber[i][j] = (number % 2);
                        number /= 2;
                    }
                    else
                        binaryNumber[i][j] = 0;
                }
            }
            
        return binaryNumber;
    }
    
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(getCharacter(matrix[i][j]) + " ");
            }
            System.out.println();
        }
    }
    
    public static char getCharacter(int number) {
        if (number == 0)
            return 'H';
        else
            return 'T';
    }
}
