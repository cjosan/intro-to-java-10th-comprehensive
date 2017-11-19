package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise529 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int spaces, year, day, daysNumber;
        int count = 0;
        int month = 1;
        System.out.println("Enter the year and the first day of it: ");
        year = sc.nextInt();
        day = sc.nextInt();
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "Sptember", "October", "November", "December"};
        
        for (int i = 0; i < 12; i++) {
            // Calculate the number of days in month
            switch (month) {
                case 2:
                    if (((year % 4 == 0) && (year % 100 != 100)) || (year % 400 == 0))
                        daysNumber = 29;
                    else
                        daysNumber = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    daysNumber = 30;
                    break;
                default:
                    daysNumber = 31;
                    break;
            }
            
            // Print the header for each month
            System.out.println("\n\t\t    " + months[i]);
            System.out.println("___________________________________________________");
            System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
            
            // Print blank spaces in calendar
            for (int j = 0; j < day; j++) {
                System.out.print("\t");
                count++;
            }
            
            // Print dates, 7 per row
            for (int k = 1; k <= daysNumber; k++) {
                count++;
                if (count % 7 == 0) {
                    System.out.println(k + "\t");
                }
                else
                    System.out.print(k + "\t");
            }
            
            System.out.println();
            count = 0;
            day = (day + daysNumber) % 7; // Calculate the number of day in week for next month
            month++;
        }
        
    }
}
