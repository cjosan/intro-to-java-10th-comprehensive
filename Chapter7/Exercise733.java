package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise733 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] animals = {"mnkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", 
                                "dragon", "snake", "horse", "sheep"};
        
        System.out.println("Enter a year:");
        int year = input.nextInt();
        
        System.out.println(year + " is the year of " + animals[year % 12]);
    }
}
