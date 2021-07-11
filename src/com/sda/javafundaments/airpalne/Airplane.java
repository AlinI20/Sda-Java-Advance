package com.sda.airpalne;

public class Airplane {
    String model;
    Engine engine;
    Seat[] seats;

    public Airplane(String model, Engine engine, Seat[] seats){
        this.model = model;
        this.engine = engine;
        this.seats = seats;
    }

    public void getInfo(){
        System.out.println("Model: " + this.model);
        System.out.println("Engine: ID - " + this.engine.id + " Power - " + this.engine.power);

        for(int index=0; index<this.seats.length; index++){
            System.out.println("Seat " + index + " " + this.seats[index].rowNumber + " is at window " + this.seats[index].isAtWindow +
                    " is booked " + seats[index].isBooked);
        }
    }

    public Seat[] getFreeSeats(){
        Seat[] seats = new Seat[5];
        for(int index=0; index<this.seats.length; index++){
            if(this.seats[index].isBooked == false){
                seats[index] = this.seats[index];
            }
        }
        return seats;
    }
}
