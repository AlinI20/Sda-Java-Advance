package com.sda.javaadvance.genericclass.model;

public class Person implements Identifiable{

    private String CNP;
    private String name;

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getID() {
        return CNP;
    }

    @Override
    public String toString() {
        return "Person{" +
                "CNP='" + CNP + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
