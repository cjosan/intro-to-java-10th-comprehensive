package introjava_iii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise825 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a 3-by-3 matrix row by row");
        double[][] matrix = new double[3][3];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        
        if (isMarkovMatrix(matrix))
            System.out.println("It is a Markov matrix");
        else
            System.out.println("It is not a Markov matrix");
    }
    
    public static boolean isMarkovMatrix(double[][] matrix) {
        return isPositive(matrix) && checkColumnSum(matrix);
    }
    
    public static boolean isPositive(double[][] matrix) {
        for (double[] m : matrix) {
            for (int j = 0; j < m.length; j++) {
                if (m[j] < 0)
                    return false;
            }
        }
        return true;
    }
    
    public static boolean checkColumnSum(double[][] matrix) {
        double sum = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }
            
            if (sum != 1.0)
                return false;
            
            sum = 0;
        }
        return true;
    }
}
