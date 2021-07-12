package com.sda.teme.hotel;

public class Adresa {
    String addrees;
    String city;
    String country;
    int geographicalCoordinates;

    public Adresa(String addrees,String city, String country,int geographicalCoordinates){
        this.addrees = addrees;
        this.city = city;
        this.country = country;
        this.geographicalCoordinates = geographicalCoordinates;
    }
    public void getAdresa(){
        System.out.println("Addrees is " + this.addrees + " City is " + this.city + " Country is " +
                this.country + " Geographical Coordinates is " + this.geographicalCoordinates);
    }
}
