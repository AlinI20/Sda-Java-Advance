package com.sda.recap.abstraction;

public class Teacher extends Person{

    String specializare;

    public Teacher(String name, String specializare){
        super(name);
        System.out.println("Person was built");
        this.specializare = specializare;
        System.out.println("Building a teacher");
    }

    @Override
    public void write() {
        System.out.println("I'm a teacher");
    }
}
