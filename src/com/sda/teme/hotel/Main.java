package com.sda.teme.hotel;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Gradinaru", "Alin", "grainaruali@gmail.com",
                074235112);
        Person p1 = new Person("Elon", "Musk", "elon.musk@gmail.com",
                04231452);

        Person p2 = new Person("Bill", "Gates", "bill.gates@gmail.com",
                076324123);
        Person[] personArray = {p, p1, p2};
        for (int i = 0; i < personArray.length; i++) {
            personArray[i].getFullName();
            personArray[i].contactInfo();
        }

        System.out.println("------------------");

        Adresa Belvedere = new Adresa("Str.Stejarul", "Brasov", "Romania",
                23);
        Belvedere.getAdresa();

        System.out.println("-----------------");

        Rooms simple = new Rooms("Simple", "booked", 12);
        Rooms luxury = new Rooms("Luxury", "Not booked", 5);
        Rooms simple1 = new Rooms("Simple", "not booked", 2);
        Rooms luxury1 = new Rooms("Luxury", "booked", 3);
        Rooms[] roomArray = {simple, luxury, simple1, luxury1};
        for (int i = 0; i < roomArray.length; i++) {
            roomArray[i].getRoom();
        }
        System.out.println("-------------------");

        ContactInfo Hotel = new ContactInfo("Belvedere", 076321423,
                "contact.belvedere@gmail");
        Hotel.GetHotelInfo();

        System.out.println("------------");


    }
}
