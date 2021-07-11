package com.sda.exercitii.ex4.engine;

public class Car extends Vehicle implements RoadInterface{
    private String engine;
    private int numberOfWheels;


    public Car(String engine,int numberOfWellse, int capacity ,int speed){
        super(speed,capacity);
        this.engine = engine;
        this.numberOfWheels = numberOfWellse;



    }


    @Override
    public void getDrive() {
        System.out.println("I'm a driver and drive the car");

    }

    @Override
    public void navigateOnRoad() {
        System.out.println("Driving on the road");

    }
}
