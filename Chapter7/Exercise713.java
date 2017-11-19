package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise713 {
    public static void main(String[] args) {
        int n = getRandom(1, 2, 3, 4, 5, 6, 7, 8, 9);
        
        System.out.println(n);
    }
    
    public static int getRandom(int... numbers) {
        int count;
        
        while (true) {
            count = 0;
            int n = (int)(1 + Math.random() * 54);
            
            for (int i = 0; i < numbers.length; i++) {
                if (n == numbers[i]) {
                    count++;
                    break;
                }
            }
            
            if (count == 0)
                return n;
        }
    }
}
