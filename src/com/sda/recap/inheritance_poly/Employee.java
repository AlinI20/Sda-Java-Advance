package com.sda.recap.inheritance_poly;

public class Employee extends Person{

    String company;

    public void write(String textToWrite) {
        System.out.println("Employee" + textToWrite);
    }
}
