package com.sda.javafundaments.exercitii.ex4.Payment;

public class ATM implements Withdraw {
    private String location;
  private   double ammount;
    private  String bank;

    public ATM(String location, double ammount, String bank){
        this.location = location;
        this.ammount = ammount;
        this.bank = bank;
    }
}
