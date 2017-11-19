package com.cjosan;

/**
 * Created by admin on 28.06.2017.
 */
public class Faculty extends Employee {
    private int hours;
    private String rank;

    public Faculty() {
    }

    public Faculty(String name, String address, int phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, int hours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.hours = hours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        if (this instanceof Faculty)
            return "Class: Faculty\nName: " + this.getName();
        else
            return super.toString();
    }
}
