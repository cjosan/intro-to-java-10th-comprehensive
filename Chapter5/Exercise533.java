package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise533 {
    public static void main(String[] args) {
        int count = 0;
        
        for (int num = 6; num <= 10000; num++) {
            for (int i = (num / 2); i > 0; i--) {
                if (num % i == 0) {
                    count += i;
                }
            }
            
            if (num == count) {
                System.out.println(num);
            }
            count = 0;
        }
    }
}
