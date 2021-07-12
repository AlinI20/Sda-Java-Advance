package com.sda.javafundaments.exercitii.ex5;

public class ContactInfo {
    String name;
    String phoneNumber;




    public ContactInfo(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


    public String toString(){

        return  " Name = " + this.name + " phone Number = " + this.phoneNumber ;


    }


}
