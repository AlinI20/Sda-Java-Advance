package com.sda.shopapp.model;

public class Customer {
    private String id;
    private String address;
    private String phoneNumber;
    private String mail;
    private Account account;
    private CustommerState custommerState;

    public Customer(String id,
                    String address,
                    String phoneNumber,
                    String mail,
                    Account account,
                    CustommerState custommerState
    ) {
        this.id = id;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.account = account;
        this.custommerState = custommerState;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {

        this.account = account;
    }

    public CustommerState getCustommerState() {
        return custommerState;
    }

    public void setCustommerState(CustommerState custommerState) {
        this.custommerState = custommerState;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", mail='" + mail + '\'' +
                ", account=" + account +
                '}';
    }
}
