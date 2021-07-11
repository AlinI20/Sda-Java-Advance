package com.sda.recap.abstraction;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person teacher = new Teacher("Bill", "Matematimica");
        Person student = new Student("Elon");

        teacher.write();
        student.write();
        teacher.walk();
        student.walk();

        List<WriteInterface> entitiesThatCanWrite = new ArrayList<>();
        entitiesThatCanWrite.add(new Teacher("Bill", "Mate"));
        entitiesThatCanWrite.add(new Student("Student"));
        entitiesThatCanWrite.add(new Robot());

        System.out.println("==============");
        for(WriteInterface objectThatKnowsHowToWrite: entitiesThatCanWrite) {
            objectThatKnowsHowToWrite.write();
        }

        Student student1 = new Student("St1");
        Student student2 = new Student("St1");
        Teacher teacher1 = new Teacher("teacher_name", "specializare");

        Person p = (Person) teacher1;
        Person studentPerson = (Person) student1;
        WriteInterface writeInterface = (WriteInterface) student1;

        Masterand masterand = new Masterand("test");
        Student st = (Student) masterand;

        // Casting-ul functioneaza doar in momentul in care incercam sa
        // transformam dintr-un obiect copil intr-un obiect parinte (obiectul copil
        // contine toate field-urile necesare pentru a deveni parinte)
        // pe cand o clasa parinte nu poate fi transformata intr-o clasa copil
        // deoarece nu contine field-urile specifice clasei copil.
        Student castStudent = new Student("test");
        Masterand fromStudent = (Masterand) castStudent;

        System.out.println(student1.equals(teacher1));
        System.out.println(student1.equals(student2));

        //Long longObject = 1L;
        //Integer integerObject = ((Integer) longObject); // why can't we cast integer to Long

        // 0.5 0.75 0.88 | 0 , 1 , 2 ... n
        double randomIndexAsDouble = Math.random() * 50;
        System.out.println("Random index as double " + randomIndexAsDouble);
        int randomIndex = (int) randomIndexAsDouble;
        System.out.println("=====random index=====");
        System.out.println(randomIndex);

    }
}
