package com.sda.teme.hotel;

public class Person {

        String firstName;
        String lastName;
        String email;
        int phoneNumber;

        public Person(String firstName, String lastName, String email, int phoneNumber) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.phoneNumber = phoneNumber;


        }

        public void getFullName() {
            System.out.println(this.firstName + " " + this.lastName);
        }

        public void contactInfo() {
            System.out.println(" Email is  " + this.email + "Phone Number is " + this.phoneNumber);

        }
}
