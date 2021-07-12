package com.sda.javafundaments.airpalne;

public class Pet {
    String type;
    String nume;
    String sound;
    int greutate;

    public Pet(){}

    public void makeSound(){
        System.out.println("Tipul animalului este " + this.type + ", cu greutatea " +
                this.greutate + " si cu numele " + this.nume + " si zice: " + this.sound);
    }

}
