package com.sda.teme.hotel;

public class Rooms {
    String type;
    String booked;
    int number;

    public Rooms(String type, String booked, int number){
        this.type = type;
        this.booked = booked;
        this.number = number;
    }
    public void getRoom(){
        System.out.println("Room type is " + this.type + " is " +this.booked + " Numbers is " + this.number);

    }


}
