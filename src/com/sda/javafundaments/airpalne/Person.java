package com.sda.javafundaments.airpalne;

public class Person {
    String nume;
    String prenume;
    int varsta;

    public Person(){}

    public boolean isAdult(){
        if (this.varsta > 18) {
            return true;
        } else {
            return false;
        }
    }

    public void sayHello(){
        System.out.println("Salut! Ma numesc " + this.nume + " " + this.prenume + " si am varsta de " + this.varsta);
    }
}
