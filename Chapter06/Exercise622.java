package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise622 {
    public static void main(String[] args) {
        System.out.println(sqrt(100));
    }
    
    public static double sqrt(long n) {
        double nextGuess;
        double lastGuess = 1.0;
        
        do {
            nextGuess = (lastGuess + (n / lastGuess)) / 2.0;
            
            if ((Math.abs(nextGuess - lastGuess)) < 0.0001)
                return nextGuess;
            
            lastGuess = nextGuess;
        } while(true);
    }
}
