package com.cjosan;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by admin on 28.06.2017.
 */
public class NewAccount {
    private String name;
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated = new Date();
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public NewAccount() {
        this("unknown", 0, 0, 0);
    }

    public NewAccount(String name, int id, double balance, double annualInterestRate) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        NewAccount.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
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
        transactions.add(new Transaction('W', amount, balance, "The withdrawal amount is " + amount +
                " The new balance is " + balance));
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance, "The deposited amount is " + amount +
                " The new balance is " + balance));
    }
}

