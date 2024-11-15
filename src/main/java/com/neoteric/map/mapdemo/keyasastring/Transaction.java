package com.neoteric.map.mapdemo.keyasastring;

public class Transaction {
    private String transactionId;
    private String amount;
    private  PaymentStatus status;

    public Transaction(String transactionId, String amount, PaymentStatus status) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.status = status;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getAmount() {
        return amount;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", amount='" + amount + '\'' +
                ", status=" + status +
                '}';
    }
}
