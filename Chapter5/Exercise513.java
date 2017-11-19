package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise513 {
    public static void main(String[] args) {
        int i = (int)Math.round(Math.pow(12000, (1.0 / 3.0)));
        while (Math.pow(i, (3)) >= 12000) {
            i--;
        }
        
        System.out.println(i);
    }
}
