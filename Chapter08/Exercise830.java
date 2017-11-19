package introjava_iii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise830 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] a = new double[2][2];
        double[] b = new double[2];
        double[] solutions = new double[2];
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("Enter a" + i + j + " ");
                a[i][j] = input.nextDouble();
            }
        }
        
        for (int i = 0; i < b.length; i++) {
            System.out.print("Enter b" + i + " ");
            b[i] = input.nextDouble();
        }
        
        solutions = solveLinearEquation(a, b);
        
        if (solutions != null)
            System.out.println("x = " + solutions[0] + "\ny = " + solutions[1]);
        else
            System.out.println("Equation has no solution");
        
    }
    
    public static double[] solveLinearEquation(double[][] a, double[] b) {
        double[] solutions = new double[2];
        
        if ((a[0][0] * a[1][1] - a[0][1] * a[1][0]) == 0)
            return null;
        
        solutions[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        solutions[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        
        return solutions;
    }
}
