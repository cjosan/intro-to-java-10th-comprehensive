package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise510 {
    public static void main(String[] args) {
        final int NUMBERS_PER_LINE = 10;
        int count = 0;
        
        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
                count++;
                
                if (count == NUMBERS_PER_LINE) {
                    System.out.println(i);
                    count = 0;
                }
            }
        }
    }
}
