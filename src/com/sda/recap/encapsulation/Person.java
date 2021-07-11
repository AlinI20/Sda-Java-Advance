package com.sda.recap.encapsulation;

public class Person {
    private int cnp;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                "cnp=" + this.cnp +
                '}';
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new RuntimeException("Varsta este sub 0 ani"); // exceptiile sunt erori in java
        } else {
            this.age = age;
            generateCNP();
        }
    }

    private void generateCNP() {
        this.cnp = (int) (Math.random() * Integer.MAX_VALUE);
    }

}
