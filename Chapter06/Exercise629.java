package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise629 {
    public static void main(String[] args) {
        int limit = 1000;
        
        for (int i = 2; i < limit; i++) {
            if (areTwinPrimes(i, (i + 2)))
                System.out.println("(" + i + ", " + (i + 2) + ")");
        }
    }
    
    public static boolean areTwinPrimes(int n, int m) {
        return (isPrime(n) && isPrime(m));
    }
    
    public static boolean isPrime(long n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        
        return true;
    }
}
