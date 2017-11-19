package com.cjosan;

/**
 * Created by admin on 28.06.2017.
 */
public class Staff extends Employee {
    private String title;

    public Staff() {
    }

    public Staff(String name, String address, int phoneNumber, String emailAddress, String office, double salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    @Override
    public String toString() {
        if (this instanceof Staff)
            return "Class: Staff\nName: " + this.getName();
        else
            return super.toString();
    }
}
