package introjava_iii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise832 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the vertices of a trianlge");
        
        double[][] vertices = new double[3][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                vertices[i][j] = input.nextDouble();
            }
        }
        
        double area = getTriangleArea(vertices);
        
        if (area > 0)
            System.out.println("The area is " + area);
        else
            System.out.println("Can not form a trinagle");
    }
    
    public static double getTriangleArea(double[][] points) {
        double[] sides = getSides(points);
        
        if (isTriangle(sides)) {
            double perimeter = (sides[0] + sides[1] + sides[2]) / 2;
            double area = Math.sqrt((perimeter * (perimeter - sides[0]) * (perimeter - sides[1]) * (perimeter - sides[2])));
            return area;
        }

        return -1;
    }
    
    public static double[] getSides(double[][] points) {
        double[] sides = new double[3];
        sides[0] = (Math.sqrt(Math.pow((points[1][0] - points[0][0]), 2) + Math.pow((points[1][1] - points[0][1]), 2)));
        sides[1] = (Math.sqrt(Math.pow((points[2][0] - points[1][0]), 2) + Math.pow((points[2][1] - points[1][1]), 2)));
        sides[2] = (Math.sqrt(Math.pow((points[2][0] - points[0][0]), 2) + Math.pow((points[2][1] - points[0][1]), 2)));
        
        return sides;
    }
    
    public static boolean isTriangle(double[] sides) {
        return (sides[0] + sides[1] > sides[2] && sides[0] + sides[2] > sides[1] && sides[1] + sides[2] > sides[0]);
    }
}
