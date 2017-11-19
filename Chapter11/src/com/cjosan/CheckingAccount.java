package com.cjosan;

/**
 * Created by admin on 28.06.2017.
 */
public class CheckingAccount extends Account{
    private double overdraftLimit;

    public CheckingAccount() {
        this.overdraftLimit = 100;
    }

    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if ((getBalance() + overdraftLimit) >= amount)
            setBalance(getBalance() - amount);
        else
            System.out.println("Cannot perform the action!");
    }
}
