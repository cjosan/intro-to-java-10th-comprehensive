package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise519 {
    public static void main(String[] args) {
        int linesNumber = 8;
        int spaces = 3 * linesNumber - 1;
        
        for (int i = 1; i <= linesNumber; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1, m = k; k <= i; k++, m *= 2) {
                    System.out.print(" " + m);
            }
            
            for (int n = (int)Math.pow(2, (i - 2)); n >= 1; n /= 2) {
                System.out.print(" " + n);
            }
            
            System.out.println();
            
            if (Math.pow(2, i) > 100)
                spaces -= 4;
            else if (Math.pow(2, i) > 10)
                spaces -= 3;
            else 
                spaces -= 2;
            
        }
    }
}
