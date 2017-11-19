package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise538 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decNum;
        String binNum = "";
        
        System.out.println("Enter a number in decimal base:");
        decNum = sc.nextInt();
        
        while (decNum > 0) {
            binNum = (decNum % 8) + binNum;
            decNum /= 8;
        }
        
        System.out.println(binNum);
    }
}
