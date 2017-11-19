package introjava_ii;

import java.util.Scanner;

/**
 *
 * @author Cornel Josan
 */
public class Exercise528 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = 1;
        int daysNumber;
        
        System.out.println("Enter the year and first day of it:");
        int year = sc.nextInt();
        int day = sc.nextInt();
        
        for (int i = 1; i <= 12; i++) {
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
            
            switch (month) {
                case 1:
                    System.out.print("January");
                    break;
                case 2:
                    System.out.print("February");
                    break;
                case 3:
                    System.out.print("March");
                    break;
                case 4:
                    System.out.print("April");
                    break;
                case 5:
                    System.out.print("May");
                    break;
                case 6:
                    System.out.print("June");
                    break;
                case 7:
                    System.out.print("July");
                    break;
                case 8:
                    System.out.print("August");
                    break;
                case 9:
                    System.out.print("September");
                    break;
                case 10:
                    System.out.print("October");
                    break;
                case 11:
                    System.out.print("November");
                    break;
                case 12:
                    System.out.print("December");
                    break;
            }
            
            System.out.print(" 1, " + year + " is: " + day);
            
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 0:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Wrong day");
            }
            
            day = (day + daysNumber) % 7;
            month++;
            
        }
    }
}
