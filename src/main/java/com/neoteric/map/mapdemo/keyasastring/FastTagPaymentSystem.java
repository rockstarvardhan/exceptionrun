package com.neoteric.map.mapdemo.keyasastring;

import org.apache.commons.collections4.map.MultiKeyMap;

import java.util.*;

public class FastTagPaymentSystem {
    public static void main(String[] args) {
        HashMap<String, Transaction> userTransactions = new HashMap<>();

        userTransactions.put("saigopi", new Transaction("TXN001","250.0",PaymentStatus.PENDING));
        userTransactions.put("vijay", new Transaction("TXN001","250.0",PaymentStatus.SUCCESS));
        System.out.println("hashmap transactions" + userTransactions);

        TreeMap<String, Transaction> sortedTransactions = new TreeMap<>(userTransactions);

        // Printing the TreeMap transactions (sorted by user ID)
        System.out.println("TreeMap Sorted Transactions: " + sortedTransactions);

        // Step 3: Creating an EnumMap to categorize transactions by PaymentStatus
        EnumMap<PaymentStatus, List<Transaction>> statusTransactions = new EnumMap<>(PaymentStatus.class);

        for (Transaction txn : userTransactions.values()) {
            statusTransactions.computeIfAbsent(txn.getStatus(), k -> new ArrayList<>()).add(txn);
        }

        // Printing the EnumMap categorized by PaymentStatus
        System.out.println("EnumMap Status Transactions: " + statusTransactions);

        // Step 4: Using MultiKeyMap to store transactions based on user and transaction type
        MultiKeyMap<String, Transaction> multiKeyTransactions = new MultiKeyMap<>();

        multiKeyTransactions.put("user123", "FASTTAG", new Transaction("TXN003", "150.0", PaymentStatus.SUCCESS));
        multiKeyTransactions.put("user456", "BOOKMYSHOW", new Transaction("TXN004", "300.0", PaymentStatus.FAILURE));

        // Printing the MultiKeyMap transactions (sorted by user ID and transaction type)
        System.out.println("MultiKeyMap Transactions: " + multiKeyTransactions);
    }


    }

