package com.neoteric.map.mapdemo.overriding;

public  abstract  class AbstractBankAccount <T> implements BankAccount<T> {
    protected double balance;
    private T accountHolder;

    public <T> AbstractBankAccount(T balance, T accountNumber) {
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public T getAccountHolder() {
        return accountHolder;
    }
}
