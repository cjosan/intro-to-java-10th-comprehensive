package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise610 {
    public static void main(String[] args) {
        int limit = 10000;
        int count = 0;
        
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
    
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
            return false; // Number is not a prime
            }
        }
        return true; // Number is prime
    }

}
