package com.sda.javaadvance.designpatterns.builder;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Person person =
                new Person.Builder(
                        "31245123",
                        "David",
                        "Anderson"
                        , new Date(),
                        "male"
                ).setReligion("Orthodox")
                        .setEmailAddress("david@gmail.com")
                        .setStudy("Bachelor")
                        .build();
        System.out.println(person);

    }
}