package introjava_iii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise834 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 6 points");
        double[][] points = new double[6][2];
        
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < 2; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        
        double[] rigthmostPoint = getRightmostLowestPoint(points);
        
        System.out.println("The rigthmost point is at (" + rigthmostPoint[0] + ", " + rigthmostPoint[1] + ")");
    }
    
    public static double[] getRightmostLowestPoint(double[][] points) {
        double[] rigthmostPoint = new double[2];
        
        rigthmostPoint[0] = points[0][0];
        rigthmostPoint[1] = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (rigthmostPoint[1] > points[i][1]) {
                rigthmostPoint[0] = points[i][0];
                rigthmostPoint[1] = points[i][1];
            }
        }
        
        
        for (int i = 0; i < points.length; i++) {
            if (rigthmostPoint[1] == points[i][1]) {
                if (rigthmostPoint[0] < points[i][0]) {
                    rigthmostPoint[0] = points[i][0];
                }
            }
        }
        
        return rigthmostPoint;
    }
}
