package introjava_iii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise837 {
    private int test;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String statesAndCapitals [][] = {{"Alabama", "Montgomery"}, {"Alaska", "Juneau"}, {"Arizona", "Phoenix"},
            {"Arkansas", "Little Rock"}, {"California", "Sacramento"}, {"Colorado", "Denver"},{"Connecticut", "Hartford"}, 
            {"Delaware", "Dover"}, {"Florida", "Tallahasse"}, {"Georgia", "Atlanta"}, {"Hawaii", "Honolulu"}, {"Idaho", "Boise"},
            {"Illinois", "Springfield"}, {"Indiana", "Indianapolis"}, {"Iowa", "Des Moines"}, {"Kansas", "Topeka"}, {"Kentucky", "Frankfort"},
            {"Louisiana", "Baton Rouge"}, {"Maine", "Augusta"}, {"Maryland", "Annapolis"}, {"Massachusettes", "Boston"}, {"Michigan", "Lansing"},
            {"Minnesota", "Saint Paul"}, {"Mississippi", "Jackson"}, {"Missouri", "Jefferson City"}, {"Montana", "Helena"}, {"Nebraska", "Lincoln"},
            {"Nevada", "Carson City"}, {"New Hampshire", "Concord"}, {"New Jersey", "Trenton"}, {"New York", "Albany"}, {"New Mexico", "Santa Fe"},
            {"North Carolina", "Raleigh"}, {"North Dakota", "Bismark"}, {"Ohio", "Columbus"}, {"Oklahoma", "Oklahoma City"}, {"Oregon", "Salem"},
            {"Pennslyvania", "Harrisburg"}, {"Rhode Island", "Providence"}, {"South Carolina", "Columbia"}, {"South Dakota", "Pierre"},
            {"Tennessee", "Nashville"}, {"Texas", "Austin"}, {"Utah", "Salt Lake City"}, {"Vermont", "Montpelier"}, {"Virginia", "Richmond"},
            {"Washington", "Olympia"}, {"West Virginia", "Charleston"}, {"Wisconsin", "Madison"}, {"Wyoming", "Cheyenne"}};
        
        int count = 0;
        for (String[] state : statesAndCapitals) {
            System.out.println("What is the capital of " + state[0] + "?");
            String answer = input.nextLine();
            
            if (answer.equalsIgnoreCase(state[1])) {
                System.out.println("Your answer is correct!");
                count++;
            }
            else
                System.out.println("The answer should be " + state[1]);
        }
        System.out.println("The correct count is " + count);
    }
}
