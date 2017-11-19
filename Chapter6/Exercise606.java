package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise606 {
    public static void main(String[] args) {
        displayPattern(7);
    }
    
    public void displayPattern(int n) {
        String row = "";
        int spaces = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < spaces; j++) {
                if (i < 10) {
                    System.out.print("  ");
                }
                else
                    System.out.print("   ");
            }
            
            row = i + " " + row;
            spaces--;
            System.out.println(row);
        }
    }
}
