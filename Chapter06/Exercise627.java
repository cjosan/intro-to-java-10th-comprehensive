package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise627 {
    public static void main(String[] args) {
        int count = 0;
        final int NUMBERS_PER_LINE = 10;
        int i = 2;
        
        while (count < 100) {
            if (isEmirp(i)) {
                count++;
                
                if (count % NUMBERS_PER_LINE != 0)
                    System.out.print(i + " ");
                else
                    System.out.println(i + " ");
            }
            
            i++;
        } 
    }
    
    public static boolean isEmirp(int n) {
        return (isPrime(n) && isPrime(reverse(n)) && !isPalindrome(n));
    }
    
    public static boolean isPalindrome(int n) {
        return (n == reverse(n));
    }
    
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        
        return true;
    }
    
    public static int reverse(int n) {
        int sum = 0;
        
        while (n > 0) {
            sum = sum * 10 + (n % 10);
            n /= 10;
        }
        
        return sum;
    }
}
