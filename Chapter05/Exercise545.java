package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise545 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        double mean = 0;
        double deviation = 0;
        
        System.out.println("Enter 10 numbers:");
        
        for (int i = 0; i < 10; i++) {
            x = sc.nextDouble();
            mean += x;
            deviation += Math.pow(x, 2);
        }
        
        deviation = Math.sqrt((deviation - Math.pow(mean, 2) / 10) / 9);
        mean /= 10;
        
        System.out.println("The mean is: " + mean);
        System.out.println("The standart deviation is: " + deviation);
        
    }
}
