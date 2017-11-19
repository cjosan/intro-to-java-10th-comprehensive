package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise639 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x0, y0, x1, y1, x2, y2;
        
        System.out.println("Enter the coordinates for three points p0, p1 and p2:");
        x0 = sc.nextDouble();
        y0 = sc.nextDouble();
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        
        if (leftOfTheLine(x0, y0, x1, y1, x2, y2))
            System.out.println("(" + x2 + ", " + y2 + ") is on the left side of the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        else if (onTheLineSegment(x0, y0, x1, y1, x2, y2))
            System.out.println("(" + x2 + ", " + y2 + ") is on the line segment from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        else if (onTheSameLine(x0, y0, x1, y1, x2, y2))
            System.out.println("(" + x2 + ", " + y2 + ") is on the same line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
        else
            System.out.println("(" + x2 + ", " + y2 + ") is on the right side of the line from (" + x0 + ", " + y0 + ") to (" + x1 + ", " + y1 + ")");
    }
    
    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) > 0);
    }
    
    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        return ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0);
    }
    
    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {
        return (((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0) && (x2 > x0 && x2 < x1) && (y2 > y0 && y2 < y1));
    }
}
