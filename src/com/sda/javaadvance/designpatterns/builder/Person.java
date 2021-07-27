package com.sda.javaadvance.designpatterns.builder;

import java.util.Date;

public class Person {
    private final String CNP;
    private final String lastName;
    private final String firstName;
    private final Date dateOfBirth;
    private final String gender;
    private final String emailAddress;
    private final String phoneNumber;
    private final String address;
    private final String study;
    private final String religion;

    private Person(Builder builder) {
        this.CNP = builder.CNP;
        this.lastName = builder.lastName;
        this.firstName = builder.firstName;
        this.dateOfBirth = builder.dateOfBirth;
        this.gender = builder.gender;
        this.emailAddress = builder.emailAddress;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;
        this.study = builder.study;
        this.religion = builder.religion;
    }

    public String getCNP() {
        return CNP;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getStudy() {
        return study;
    }

    public String getReligion() {
        return religion;
    }

    @Override
    public String toString() {
        return "Person{" +
                "CNP='" + CNP + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", study='" + study + '\'' +
                ", religion='" + religion + '\'' +
                '}';
    }

    public static class Builder {
        private final String CNP;
        private final String lastName;
        private final String firstName;
        private final Date dateOfBirth;
        private String gender;
        private String emailAddress;
        private String phoneNumber;
        private String address;
        private String study;
        private String religion;

        public Builder(String CNP, String lastName, String firstName, Date dateOfBirth, String gender) {
            this.CNP = CNP;
            this.lastName = lastName;
            this.firstName = firstName;
            this.dateOfBirth = dateOfBirth;
            this.gender = gender;
        }

        public Builder setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setStudy(String study) {
            this.study = study;
            return this;
        }

        public Builder setReligion(String religion) {
            this.religion = religion;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

}
