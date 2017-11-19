package com.cjosan;

/**
 * Created by admin on 28.06.2017.
 */
public class SavingsAccount extends Account {
    public SavingsAccount() {
    }

    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount)
            setBalance(getBalance() - amount);
        else
            System.out.println("Cannot perform the action!");
    }
}
