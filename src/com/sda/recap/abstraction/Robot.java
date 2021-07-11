package com.sda.recap.abstraction;

public class Robot implements WriteInterface{
    @Override
    public void write() {
        System.out.println("I'm a robot and I know how to write...");
    }
}
