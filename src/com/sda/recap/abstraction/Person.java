package com.sda.recap.abstraction;


// ce este o clasa abstracta :
// * metodele pe care le definim aici nu le putem da behaviour
// * nu se poate instantia un obiect al unei clase abstracte

// A Student IS-A Person
// A Teacher IS-A Person
public abstract class Person implements WriteInterface{
    String name;

    public Person(String name) {
        System.out.println("Building a person...");
        this.name = name;
    }

    public void walk() {
        System.out.println("I'm a person and I'm walking..");
    }

}
