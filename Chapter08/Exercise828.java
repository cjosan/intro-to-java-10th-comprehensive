package introjava_iii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise828 {
    public static void main(String[] args) {
        System.out.println("Enter list1");
        int[][] m1 = new int[3][3];
        enterMatrix(m1);
        
        System.out.println("Enter list2");
        int[][] m2 = new int[3][3];
        enterMatrix(m2);
        
        if (equals(m1, m2))
            System.out.println("The two matrices are strictly identical");
        else
            System.out.println("The two matrices are not strictly identical");
        
    }
    
    public static void enterMatrix(int[][] matrix) {
        Scanner input = new Scanner(System.in);
        
        for (int[] i : matrix) {
            for (int j = 0; j < i.length; j++) {
                i[j] = input.nextInt();
            }
        }
    }
    
    public static boolean equals(int[][] m1, int[][] m2) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                if (m1[i][j] != m2[i][j])
                    return false;
            }
        }
        return true;
    }
}
