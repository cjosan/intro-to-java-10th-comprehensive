package com.cjosan;

/**
 * Created by admin on 18.06.2017.
 */
public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(System.currentTimeMillis());
    }

    public Time(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000;
        this.second = (int) (totalSeconds % 60);
        this.minute = (int) (totalSeconds / 60) % 60;
        this.hour = (int) (totalSeconds / 3600) % 24;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapsedTime) {
        long totalSeconds = elapsedTime / 1000;
        this.second = (int) (totalSeconds % 60);
        this.minute = (int) (totalSeconds / 60) % 60;
        this.hour = (int) (totalSeconds / 3600) % 24;;
    }
}
