package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise527 {
    public static void main(String[] args) {
        final int YEARS_PER_LINE = 10;
        int count = 0;
        
        for (int i = 101; i <= 2100; i++) {
            if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0)) {
                count++;
                
                if (count % YEARS_PER_LINE == 0)
                    System.out.println(i);
                else
                    System.out.print(i + " ");
            }
        }
    }
}
