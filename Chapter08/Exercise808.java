package introjava_iii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise808 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        int numberOfPoints = input.nextInt();

        // Create an array to store points
        double[][] points = new double[numberOfPoints][2];
        System.out.print("Enter " + numberOfPoints + " points: ");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }
        
        double shortestDistance = getShortestDistance(points);
        double[][][] shortestDistancePoints = getPairsWithShortestDistance(points, shortestDistance);

        // Display result
        for (double[][] pair : shortestDistancePoints) {
            System.out.println("The closest two points are " +
            "(" + pair[0][0] + ", " + pair[0][1] +") and (" +
            pair[1][0] + ", " + pair[1][1] + ")");
        }
        System.out.println("Their distance is " + shortestDistance);
    }
    
    public static double[][][] getPairsWithShortestDistance(double[][] points, double shortestDistance) {
        double[][][] pairs = new double[0][2][2];
        
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
                
                if (distance == shortestDistance) {
                    pairs = add(pairs, points[i], points[j]);
                }
            }
        }
        return pairs;
    }
    
    public static double getShortestDistance(double[][] points) {
        // p1 and p2 are the indices in the points' array
        int p1 = 0, p2 = 1; // Initial two points
        double shortestDistance = distance(points[p1][0], points[p1][1], points[p2][0], points[p2][1]); // Initialize shortestDistance
        
        // Compute distance for every two points
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]); // Find distance

                if (shortestDistance > distance) {
                    shortestDistance = distance; // Update shortestDistance
                }
            }
        }
        return shortestDistance;
    }
    
    /** Compute the distance between two points (x1, y1) and (x2, y2)*/
    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
    
    public static double[][][] add(double[][][] array, double[] point1, double[] point2) {
        double[][][] newArray = new double[array.length + 1][2][2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length][0] = point1;
        newArray[array.length][1] = point2;
        
        return newArray;
    }
}
