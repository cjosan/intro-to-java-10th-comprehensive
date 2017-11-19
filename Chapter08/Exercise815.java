package introjava_iii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise815 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] points = new double[5][2];
        
        System.out.println("Enter five points");
        
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        
        if (isSameLine(points))
            System.out.println("The five points are on the same line");
        else
            System.out.println("The five points are not on the same line");
        
        
        
    }
    
    public static boolean isSameLine(double[][] points) {
        double total = 0;
        
        for (int i = 1; i < points.length - 1; i++) {
            total = (points[points.length - 1][0] - points[0][0]) * (points[i][1] - points[0][0]) - 
                    (points[i][0] - points[0][0]) * (points[points.length - 1][1] - points[0][1]);
            
            if (total != 0)
                return false;
        }
        return true;
    }
}
