package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise509 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numberOfStudents = Integer.parseInt(sc.nextLine());
        int score = -1, highestScore = -1;
        String name, bestStudent = "", secondStudent = "";
        
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter the name and score of student number " + (i + 1) + ":");
            
            do {
                name = sc.nextLine();
                
                if(name.equals(""))
                    System.out.println("Enter the name please!");
            } while (name.equals(""));
            
            do {
                try {
                    score = Integer.parseInt(sc.nextLine());
                } catch (NumberFormatException ex) {
                    System.out.println("You should enter a numeric non-negative value.");
                }
                
                if (score < 0)
                    System.out.println("Enter a valid score please. Try again!");
            } while (score < 0);
            
            if (score > highestScore) {
                if (i >= 1)
                    secondStudent = bestStudent;
                highestScore = score;
                bestStudent = name; 
            }
        }
        
        System.out.println("The student with the highest grade is: " + bestStudent);
        
        if (numberOfStudents >= 2)
            System.out.println("The student with the second-highest score is: " + secondStudent);
    }
}
