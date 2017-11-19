package introjava_ii;

/**
 *
 * @author Cornel Josan
 */
public class Exercise624 {
    public static void main(String[] args) {
        long millis = System.currentTimeMillis();
        displayCurrentTimeAndDate(millis);
    }
    
    public static void displayCurrentTimeAndDate(long millis) {
        int totalDays = getTotalNumberOfDays(millis);
        String time = getCurrentTime(millis, 3);
        int year = getCurrentYear(millis);
        int month = getCurrentMonth(totalDays, year);
        int day = getCurrentDay(totalDays, month, year);
        System.out.println(time + " " + day + "/" + getMonthName(month) + "/" + year);
        
    }
    
    public static String getCurrentTime(long millis, int GMT) {
        long totalHours, currentHour, totalMinutes, currentMinute, totalSeconds, currentSecond;
        totalSeconds = millis / 1000;
        currentSecond = totalSeconds % 60;
        totalMinutes = totalSeconds / 60;
        currentMinute = totalMinutes % 60;
        totalHours = totalMinutes / 60;
        currentHour = (totalHours % 24) + GMT;
        return (currentHour + ":" + currentMinute + ":" + currentSecond);
    }
    
    public static int getCurrentYear(long millis) {
        return (int)((millis / 1000/60/60/24) / 365) + 1970;
    }
    
    public static int getCurrentMonth(int days, int year) {
        int month = 1;
        while (days >= 0) {
            days -= getNumberOfDaysInMonth(month, year);
            month++;
        }
        return (month - 1);
    }
    
    public static int getCurrentDay(int days, int month, int year) {
        for (int i = 1; i < month; i++) {
            days -= getNumberOfDaysInMonth(i, year);
        }
        
        return days;
    }
    
    public static int getTotalNumberOfDays(long millis) {
        int days = (int)(millis / 1000/60/60/24);
        int year = 1970;
        
        while (days >= 365) {
            if (!isLeap(year))
                days -= 365;
            else
                days -= 366;
            
            year++;
        }
        
        return (days + 1);
    }
    
    public static boolean isLeap(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }
    
    public static int getNumberOfDaysInMonth (int month, int year) {
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if(!isLeap(year))
                    return 28;
                else
                    return 29;
            default:
                return 31;
        }
    }
    
    public static String getMonthName(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "Septemeber";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        
        return "Wrong month";
    }
}
