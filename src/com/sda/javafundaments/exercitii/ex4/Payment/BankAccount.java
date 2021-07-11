package com.sda.exercitii.ex4.Payment;

public class BankAccount implements Withdraw{
    private String name;
    private String bank;

    public BankAccount(String name, String bank) {
        this.name = name;
        this.bank = bank;
    }
}
