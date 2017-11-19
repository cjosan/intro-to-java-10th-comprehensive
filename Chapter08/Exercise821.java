package introjava_iii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise821 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of cities");
        int citiesNumber = input.nextInt();
        double[][] cities = new double[citiesNumber][2];
        double[][] distances = new double[citiesNumber][citiesNumber];
        
        System.out.println("Enter the coordinates of the cities");
        for (int i = 0; i < citiesNumber; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                cities[i][j] = input.nextDouble();
            }
        }
        
        getDistances(cities, distances);
        
        double[] totalDistances = new double[citiesNumber];
        
        for (int i = 0; i < citiesNumber; i++) {
            totalDistances[i] = getSum(distances[i]);
        }
        
        int minDistance = getMin(totalDistances);
        
        System.out.println("The central city is at (" + cities[minDistance][0] + ", " + cities[minDistance][1] + ")");
        System.out.println("The total distance to all other cities is " + totalDistances[minDistance]);
        
        
    }
    
    public static void getDistances(double[][] cities, double[][] distances) {
        for (int i = 0; i < distances.length; i++) {
            for (int j = 0; j < distances[i].length; j++) {
                if (i != j)
                    distances[i][j] = getDistance(cities[i], cities[j]);
            }
        }
    }
    
    public static double getDistance(double[] city1, double[] city2) {
        return Math.sqrt((city2[0] - city1[0]) * (city2[0] - city1[0]) + (city2[1] - city1[1]) * (city2[1] - city1[1]));
    }
    
    public static double getSum(double[] array) {
        double total = 0;
        for (double a : array) {
            total += a;
        }
        return total;
    }
    
    public static int getMin(double[] array) {
        double min = array[0];
        int position = 0;
        
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                position = i;
            }
        }
        return position;
    }
}
