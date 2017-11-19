package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise601 {
    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10;
        
        for (int i = 1; i <= 100; i++) {
            if (i % NUMBERS_PER_LINE != 0)
                System.out.print(getPentagonalNumber(i) + " ");
            else
                System.out.println(getPentagonalNumber(i) + " ");
        }
    }
    
    public static int getPentagonalNumber(int n) {
        return (n * (3 * n - 1) / 2);
    }
}
