package com.sda.javafundaments.airpalne;

public class Engine {
    int power;
    int speed = 0;
    boolean isEngineOn = false;
    String id;

    public Engine(int power, String id){
        this.power = power;
        this.id = id;
    }

    public void startEngine(){
        this.isEngineOn = true;
        System.out.println("Starting engine...");
    }

    public void increaseSpeed(int kmh){

        if(this.speed >= 1000) {
            System.out.println("Maximum speed reached!");
            return;
        }

        if(this.isEngineOn) {
            this.speed = this.speed + kmh;
            System.out.println(this.speed);
        } else {
            System.out.println("Please turn on the engine!");
        }
    }
}
