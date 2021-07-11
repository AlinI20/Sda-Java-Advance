package com.sda.exercitii.ex4.engine;

public class MotorCycle extends Vehicle implements RoadInterface{


    public MotorCycle(int speed,int capacity){
        super(speed, capacity);
    }

    @Override
    public void getDrive() {
        System.out.println();

    }

    @Override
    public void navigateOnRoad() {

    }
}
