package introjava_iii;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise829 {
    public static void main(String[] args) {
        System.out.println("Enter list1");
        int[][] m1 = new int[3][3];
        enterMatrix(m1);
        
        System.out.println("Enter list2");
        int[][] m2 = new int[3][3];
        enterMatrix(m2);
        
        int[] newM1 = to1DArray(m1);
        int[] newM2 = to1DArray(m2);
        
        Arrays.sort(newM1);
        Arrays.sort(newM2);

        if (equals(newM1, newM2))
            System.out.println("The matrices are identical");
        else
            System.out.println("The matrices are not identical");
    }
    
    public static void enterMatrix(int[][] matrix) {
        Scanner input = new Scanner(System.in);
        
        for (int[] i : matrix) {
            for (int j = 0; j < i.length; j++) {
                i[j] = input.nextInt();
            }
        }
    }
    
    public static int[] to1DArray(int[][] matrix) {
        int[] array = new int[matrix.length * matrix.length];
        int row = 0;
        
        for (int[] m : matrix) {
            System.arraycopy(m, 0, array, row, m.length);
            row += 3;
        }
        return array;
    }
    
    public static boolean equals(int[] m1, int[] m2) {
        for (int i = 0; i < m1.length; i++) {
            if (m1[i] != m2[i])
                return false;
        }
        return true;
    }
}
