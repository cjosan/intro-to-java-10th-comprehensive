package com.cjosan;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyCalendar {
    private Calendar calendar;

    public MyCalendar(int year, int month) {
        this.calendar = new GregorianCalendar(year, month, 1);
    }

    public MyCalendar(int year) {
        this(year, new GregorianCalendar().get(Calendar.MONTH));
    }

    public MyCalendar() {
        this(new GregorianCalendar().get(Calendar.YEAR), new GregorianCalendar().get(Calendar.MONTH));
    }

    /**
     * Print the calendar for a month in a year
     */
    public void printMonth() {
        // Print the headings of the calendar
        printMonthTitle();

        // Print the body of the calendar
        printMonthBody();
    }

    /**
     * Print the month title, e.g., March 2012
     */
    private void printMonthTitle() {
        System.out.println(" " + calendar.get(Calendar.MONTH) + " " + calendar.get(Calendar.YEAR));
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    /**
     * Print month body
     */
    private void printMonthBody() {
        // Get start day of the week for the first date in the month
        int startDay = calendar.get(Calendar.DAY_OF_WEEK);

        // Get number of days in the month
        int numberOfDaysInMonth = getNumberOfDaysInMonth();


        // Pad space before the first day of the month
        int i = 0;
        for (i = 1; i < startDay; i++)
            System.out.print("\t");

        for (i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);

            if ((i + startDay - 1) % 7 == 0)
                System.out.println();
        }

        System.out.println();
    }

    /**
     * Get the number of days in a month
     */
    private int getNumberOfDaysInMonth() {
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;

        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if (month == 2)
            return isLeapYear(year) ? 29 : 28;
        return 0; // If month is incorrect
    }

    /**
     * Determine if it is a leap year
     */
    private boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
