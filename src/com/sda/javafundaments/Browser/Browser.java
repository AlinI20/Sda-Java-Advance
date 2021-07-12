package com.sda.javafundaments.Browser;

public class Browser {
    String name;
    int version;

    public Browser(String name, int version){
        this.name = name;
        this.version = version;
    }
    public void open(){
        System.out.println("Name opening" + this.name + "Name version " + this.version);

    }
}


