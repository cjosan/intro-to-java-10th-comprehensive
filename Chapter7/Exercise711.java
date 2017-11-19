package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise711 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[] x = new double[10];
        
        System.out.println("Enter ten numbers");
        
        for (int i = 0; i < x.length; i++) {
            x[i] = input.nextDouble();
        }
        
        System.out.printf("The mean is %.2f\n", mean(x));
        System.out.printf("The standart deviation is %.5f\n", deviation(x));
    }
    
    public static double deviation(double[] x) {
        double mean = mean(x);
        double sum = 0;
        
        for (int i = 0; i < x.length; i++) {
            sum += Math.pow((x[i] - mean), 2);
        }
        
        return Math.sqrt(sum / (x.length - 1));
        
    }
    
    public static double mean(double[] x) {
        double sum = 0;
        
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        
        return (sum / x.length);
    }
}
