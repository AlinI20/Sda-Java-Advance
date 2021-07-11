package com.sda.recap.inheritance_poly;

// O clasa este un pattern bazat pe care se pot crea ulterior obiecte;
public class Person {

    int age;
    // field-uri / caracteristrici

    // Constructorul este o metoda speciala cu care putem crea obiecte
    public Person(int age) {
        // this - este un keyword care face referire la instanta curenta a obiectului
        this.age = age;
    }

    // constructor overloading (mai multi constructori cu diferiti parametrii)
    public Person() {

    }
    // constructori


    // O actiune pe care obiectul o poate face

    // specificator de access (access modifier)
    // |    return type (void cand nu returnam nimic)
    // |    |      - numele metodei
    // V    V     V                     <--- parametrii
    public void write(String textToWrite) {
        System.out.println("I'm a person" +  textToWrite);
    }

    //        - o metoda statica poate fi apelata fara instantierea clasei din care face parte
    //        V
    public static void doStaticWork() {
        System.out.println("Static work...");
    }




}
