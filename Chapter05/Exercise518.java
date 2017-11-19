package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise518 {
    public static void main(String[] args) {
        int lineNumber = 6;
        int spaces = 2 * lineNumber - 1;
        
        // Pattern A
        for (int i = 1; i <= lineNumber; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            
            System.out.println();
        }
        
        System.out.println();
        
        // Pattern B
        for (int i = lineNumber; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            
            System.out.println();
        }
        
        System.out.println();
        
        // Pattern C
        for (int i = 1; i <= lineNumber; i++) {
            for (int k = spaces; k > 0; k--) {
                System.out.print(" ");
            }
            
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            spaces -= 2;
        }
        
        System.out.println();
        
        // Pattern D
        spaces = 0;
        for (int i = lineNumber; i >= 1; i--) {
            for(int k = 0; k <= spaces; k++) {
                System.out.print(" ");
            }
            
            for(int j = 1; j <= i; j++)
                System.out.print(j + " ");
            
            System.out.println();
            spaces += 2;
        }
        
    }
}
