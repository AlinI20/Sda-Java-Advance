package com.sda.javafundaments.exercitii.ex4.engine;

public abstract class Vehicle {

    private int speed;
    private int capacity;

    public Vehicle(int speed,int capacity){
        this.speed = speed;
        this.capacity = capacity;
    }

    public abstract void getDrive();




    }



