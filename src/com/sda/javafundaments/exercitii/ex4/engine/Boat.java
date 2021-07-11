package com.sda.exercitii.ex4.engine;

public class Boat extends Vehicle implements Float{
    private String engine;


public Boat(String engine,int speed, int capacity){
    super(speed, capacity);
    this.engine = engine;
}

    @Override
    public void getDrive() {
        System.out.println("I'm a mariner and drive a boat");

    }

    @Override
    public void doFloat() {
        System.out.println("boat is floating");

    }
}
