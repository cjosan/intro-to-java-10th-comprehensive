package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise548 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0)
                System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
