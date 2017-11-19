package introjava_iii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise831 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[][] points = new double[4][2];
        System.out.println("Enter 4 points");
        
        for (int i = 0 ; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        double[] intersection = getIntersectingPoint(points);
        
        if (intersection != null)
            System.out.println(intersection[0] + " " + intersection[1]);
        else
            System.out.println("The lines are parallel");
    }
    
    public static double[] getIntersectingPoint(double[][] points) {
        double[][] a = new double[2][2];
        double[] b = new double[2];
        double[] intersection = new double[2];
        a[0][0] = (points[0][1] - points[1][1]);
        a[0][1] = (points[0][0] - points[1][0]);
        a[1][0] = (points[2][1] - points[3][1]);
        a[1][1] = (points[2][0] - points[3][0]);
        b[0] = (points[0][1] - points[1][1]) * points[0][0] - (points[0][0] - points[1][0]) * points[0][1];
        b[1] = (points[2][1] - points[3][1]) * points[2][0] - (points[2][0] - points[3][0]) * points[2][1];
        
        intersection = solveLinearEquation(a, b);
        
        return intersection;
    }
    
    public static double[] solveLinearEquation(double[][] a, double[] b) {
        double[] solutions = new double[2];
        
        if ((a[0][0] * a[1][1] - a[0][1] * a[1][0]) == 0)
            return null;
        
        solutions[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        solutions[1] = -(b[1] * a[0][0] - b[0] * a[1][0]) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
        
        return solutions;
    }
}
