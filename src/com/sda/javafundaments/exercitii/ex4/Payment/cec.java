package com.sda.exercitii.ex4.Payment;

public class cec implements Withdraw{
    private String accoountName;

    private double fixedAmountOfMoney;

    public cec(String accoountName, double fixedAmountOfMoney){
        this.accoountName = accoountName;
        this.fixedAmountOfMoney = fixedAmountOfMoney;
    }
}
