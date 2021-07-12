package com.sda.javaadvance.genericclass.model;

public class MobilePhone implements Identifiable{
    private String IMEI;
    private String brand;

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getID() {
        return IMEI;
    }
}
