package introjava_ii;

import java.util.Scanner;
/**
 *
 * @author Cornel Josan
 */
public class Exercise544 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter an integer: ");
       short n = input.nextShort();
       String s = "";

       short mask = 0b1; // to extract the last bit after shifting

       for (int i = 0; i < Short.SIZE; i++) {
           short bit = (short) (n & mask); // extracting last bit i.e the
                                           // remainder of
                                           // division by 2
           s = bit + s;
           n = (byte) (n >> 1); // Shifting right is dividing by 2. The last       
                                // bit is the remainder of the next shift.
       }

       System.out.println("The bits are:\n" + s);
    }
}
