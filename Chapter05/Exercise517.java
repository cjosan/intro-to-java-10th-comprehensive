package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise517 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int linesNumber = sc.nextInt();
        
        int leftSpaces = 2 * linesNumber + Math.abs(linesNumber - 10);
        
        for (int i = 1; i <= linesNumber; i++) {
            for (int j = 0; j < leftSpaces; j++) {
                System.out.print(" ");
            }
            
            for (int k = i; k > 0; k--) {
                System.out.print(" " + k);
            }
            
            for (int m = 1; m < i;) {
                System.out.print(" " + (++m));
            }
            
            System.out.println();
            
            if(i < 9)
                leftSpaces -= 2;
            else
                leftSpaces -=3;
                
        }
    }
}
