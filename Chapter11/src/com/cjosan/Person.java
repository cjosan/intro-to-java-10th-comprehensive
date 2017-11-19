package com.cjosan;

/**
 * Created by admin on 28.06.2017.
 */
public class Person {
    private String name;
    private String address;
    private int phoneNumber;
    private String emailAddress;

    public Person() {
    }

    public Person(String name, String address, int phoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Class: Person\nName: " + name;
    }
}
