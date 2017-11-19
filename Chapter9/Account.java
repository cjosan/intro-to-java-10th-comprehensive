package com.company;

import java.util.Date;

/**
 * Created by admin on 16.06.2017.
 */
public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate = 0;
    private Date dateCreated = new Date();

    public Account() {
        this(0,0);
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate() / 100;
    }

    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
