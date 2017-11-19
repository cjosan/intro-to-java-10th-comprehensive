package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise540 {
    public static void main(String[] args) {
        int headCount = 0, tailCount = 0;
        
        for (int i = 0; i < 1000000; i++) {
            byte coin = (byte)(Math.random() * 2);
            
            if (coin == 0)
                headCount++;
            else
                tailCount++;
        }
        
        System.out.println("Number of heads: " + headCount + "\nNumber of tails: " + tailCount);
    }
}
