package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise714 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.println("Enter the number of integers");
        int n =input.nextInt();
        int[] numbers = new int[n];
        
        System.out.println("Enter the numbers");
        
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        
        System.out.println("The gcd is " + gcd(numbers));
    }
    
    public static int gcd(int... numbers) {
        int count;
        for (int i = (int)Math.sqrt(getMax(numbers)); i > 0; i--) {
            count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] % i != 0) {
                    count++;
                    break;
                }
            }
            
            if (count == 0)
                return i;
        }
        return 1;
    }
    
    public static int getMax(int... numbers) {
        int max = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max)
                max = numbers[i];
        }
        
        return max;
    }
}
