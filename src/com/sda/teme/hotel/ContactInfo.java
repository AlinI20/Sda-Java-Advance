package com.sda.teme.hotel;

public class ContactInfo {
    String name;
    int phoneNumber;
    String email;


    public ContactInfo(String name, int phoneNumber, String email) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public void GetHotelInfo(){
        System.out.println(" Hotel " + this.name + " Contact data is " + " Phone Number " + this.phoneNumber +
                " Email " + this.email);
    }

}
