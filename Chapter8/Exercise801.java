package introjava_iii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise801 {
    public static void main(String[] args) {
        double[][] array = initArray();
        for (int i = 0; i < array[0].length; i++) {
            System.out.println("Sum of the elements at the column " + i + " is " + sumColumn(array, i));
        }
    }
    
    public static double[][] initArray() {
        Scanner input = new Scanner(System.in);
        double[][] array = new double[3][4];
        
        System.out.println("Enter a 3-by-4 matrix row at row");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = input.nextDouble();
            }
        }
        
        return array;
    }
    
    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        
        for (double[] m1 : m) {
            sum += m1[columnIndex];
        }
        
        return sum;
    }
}
