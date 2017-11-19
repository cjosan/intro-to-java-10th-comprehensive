package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise725 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double roots[] = new double[2];
        double[] eqn = new double[3];
        
        System.out.println("Enter values for a, b and c");
        
        for (int i = 0; i < 3; i++) {
            eqn[i] = input.nextDouble();
        }
        
        int numberOfRoots = solveQuadratic(eqn, roots);
        
        System.out.println("The quadratic equation has " + numberOfRoots + " real roots");
        
        if (numberOfRoots > 0) {
            System.out.println("The real roots are:");

            for(int i = 0; i < numberOfRoots; i++) {
                System.out.println(roots[i]);
            }
        }
    }
    
    public static int solveQuadratic(double[] eqn, double[] roots) {
        double delta = Math.pow(eqn[1], 2.0) - (4 * eqn[0] * eqn[2]);
        
        if (delta < 0) {
            return 0;
        }
        else if (delta == 0) {
            roots[0] = ((-eqn[1] - Math.sqrt(delta)) / (2 * eqn[0]));
            return 1;
        }
        else {
            roots[0] = ((-eqn[1] - Math.sqrt(delta)) / (2 * eqn[0]));
            roots[1] = ((-eqn[1] + Math.sqrt(delta)) / (2 * eqn[0]));
            return 2;
        }
    }
}
