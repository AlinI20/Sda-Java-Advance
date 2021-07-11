package com.sda.recap.abstraction;

public class Student extends Person{

    public Student(String name) {
        super(name);
    }

    @Override
    public void write() {
        System.out.println("I'm a student");
    }

    public void walk() {
        System.out.println("I'm not walking, I'm going with bycicle");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        // teacher != student;
        if (obj.getClass() != this.getClass()) {
            return false;
        }

        //
        // Stim ca avem un obiect de tipul student;
        //
        Student studentObj = (Student) obj;

        if (studentObj.name.equals(this.name)) {
            return true;
        }
        return false;
    }
}
