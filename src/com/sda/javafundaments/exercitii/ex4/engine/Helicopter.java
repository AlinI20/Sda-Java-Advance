package com.sda.exercitii.ex4.engine;

public class Helicopter extends Vehicle implements FlyInterface {
    private int nbOfengines;
    private int nbOfElice;

    public Helicopter(int speed, int capacity , int nbOfengines, int nbOfElice){
        super(speed,capacity);
        this.nbOfElice=nbOfElice;
        this.nbOfengines=nbOfengines;
    }

    @Override
    public void getDrive() {
        System.out.println("I;m a helicopter driver and drive a helicopter");

    }

    @Override
    public void liftOff() {
        System.out.println("lift up");
    }

    @Override
    public void fly() {
        System.out.println("Helicopter fly");

    }
}
