package com.neoteric.map.mapdemo.overriding;



public class SavingsAccount {
    private String accountHolder;
    private double balance;

    public SavingsAccount(String accountHolder, double balance) {
        if (accountHolder == null || accountHolder.isEmpty()) {
            throw new IllegalArgumentException("Account holder name cannot be null or empty.");
        }
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds in your Savings Account.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    public String getAccountHolder() {
        return accountHolder;
    }
}
