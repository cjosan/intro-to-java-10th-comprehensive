package com.cjosan;

/**
 * Created by admin on 28.06.2017.
 */
public class Student extends Person {
    private final String classStatus;

    public Student(String classStatus) {
        this.classStatus = classStatus;
    }

    public Student(String name, String address, int phoneNumber, String emailAddress, String classStatus) {
        super(name, address, phoneNumber, emailAddress);
        this.classStatus = classStatus;
    }

    @Override
    public String toString() {
        if (this instanceof Student)
            return "Class: Student\nName: " + this.getName();
        else
            return super.toString();
    }
}
