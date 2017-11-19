package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise706 {
    public static void main(String[] args) {
        int[] primes = new int[50];
        primes[0] = 2;
        getPrimeNumbers(primes);
        displayPrimes(primes, 10);
    }
    
    public static void displayPrimes(int [] primes, int perLine) {
        int count = 0;
        
        for (int number : primes) {
            if (((count + 1) % perLine) == 0) {
                System.out.println(number);
                count++;
            }
            else {
                System.out.print(number + " ");
                count++;
            }
        }
    }
    
    public static void getPrimeNumbers(int [] primes) {
        int number = 2;
        for (int i = 1; i < primes.length; i++) {
            while (true) {
                number++;
                
                if (isPrime(primes, number)) {
                    primes[i] = number;
                    break;
                }
            }
        }
    }
    
    public static boolean isPrime(int[] primes, int n) {
        int j = 0;
        while (j < primes.length && primes[j] <= Math.sqrt(n) && primes[j] != 0) {
            if (n % primes[j] == 0) {
                return false;
            }
            j++;
        }
        return true;
    }
}
