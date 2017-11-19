package com.cjosan;

/**
 * Created by admin on 28.06.2017.
 */
public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    public Employee() {
    }

    public Employee(String name, String address, int phoneNumber, String emailAddress, String office, double salary, MyDate dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        if (this instanceof Employee)
            return "Class: Employee\nName: " + this.getName();
        else
            return super.toString();
    }
}
