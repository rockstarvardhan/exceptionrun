package com.neoteric.map.mapdemo.overriding;

public class CurrentAccount <T> extends AbstractBankAccount<T>{
    private double overdraftLimit;
    public CurrentAccount(double balance,double overdraftLimit, T accountHolder){
        super(balance,accountHolder);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        System.out.println("Processing withdrawal from Current Account for " + getAccountHolder() + "...");
        if (amount > balance + overdraftLimit) {
            throw new InsufficientFundsException("Exceeds overdraft limit. Cannot process withdrawal.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: $" + balance);
    }
    }

