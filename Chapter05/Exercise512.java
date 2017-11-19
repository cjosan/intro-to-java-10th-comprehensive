package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise512 {
    public static void main(String[] args) {
        int i = (int)Math.sqrt(12000);
        while(Math.pow(i, 2) < 12000) {
            i++;
        }
        
        System.out.println(i);
    }
}
