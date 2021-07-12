package com.sda.javafundaments.airpalne;

public class Seat {
    int rowNumber;
    boolean isAtWindow;
    boolean isBooked = false;

    public Seat(int rowNumber, boolean isAtWindow){
        this.rowNumber = rowNumber;
        this.isAtWindow = isAtWindow;
    }

    public void bookSeat(){
        this.isBooked = true;
    }
}
