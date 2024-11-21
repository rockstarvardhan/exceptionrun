package com.neoteric.map.mapdemo.overriding;


public class BankSystemTest {
    public static void main(String[] args) {
        try {
            SavingsAccount account = new SavingsAccount("John Doe", 50000);
            System.out.println("Processing withdrawal from Savings Account for " + account.getAccountHolder() + "...");
            account.withdraw(10000);
        } catch (InsufficientFundsException e) {
            System.out.println("error:" + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Account creation error: " + e.getMessage());
        }
    }
}
