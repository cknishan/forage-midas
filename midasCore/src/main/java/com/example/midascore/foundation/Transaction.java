package com.example.midascore.foundation;

public class Transaction {
    private String id;
    private double amount;

    // Default constructor (required for deserialization)
    public Transaction() {
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{id='" + id + "', amount=" + amount + "}";
    }

}