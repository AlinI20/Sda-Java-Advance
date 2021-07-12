package com.sda.javafundaments.exercitii.ex4.engine;

public class Plain extends Vehicle implements FlyInterface {
    private int numberOfEngines;
    private int numberOfWings;
    private String model;



    public Plain(int numberOfEngines, int numberOfWings, String model, int speed,int capasity){
        super(speed, capasity);
        this.numberOfEngines = numberOfEngines;
        this.numberOfWings = numberOfWings;
        this.model = model;

    }

    @Override
    public void getDrive() {
        System.out.println("I'm a pilot and drive a plain");
    }

    @Override
    public void liftOff() {
        System.out.println("Increes speed and lift up");
    }

    @Override
    public void fly() {
        System.out.println("flying");

    }
}
