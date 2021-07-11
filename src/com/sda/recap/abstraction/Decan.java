package com.sda.recap.abstraction;

public class Decan extends Person{

    public Decan(String name) {
        super(name);
    }

    @Override
    public void write() {
        System.out.println("I'm a decan");
    }
}
