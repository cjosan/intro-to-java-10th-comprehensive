package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise628 {
    public static void main(String[] args) {
        System.out.println("p\t\t2^p-1");
        System.out.println("-----------------------");
        
        for (long i = 2; i <= 31; i++) {
            if (isPrime(i) && isPrime(pow(2, i) - 1))
                System.out.println(i + "\t\t" + (pow(2, i) - 1));
        }
    }
    
    public static boolean isPrime(long n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        
        return true;
    }
    
    long pow(long base, long exponent) {
        long aux = 1;
        
        while(exponent > 0) {
            if (exponent % 2 == 1) {
                aux *= base;
            }
            base *= base;
            exponent /= 2;
        }
        return aux;
    }
}
