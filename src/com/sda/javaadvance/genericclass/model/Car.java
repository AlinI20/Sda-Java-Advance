package com.sda.javaadvance.genericclass.model;

public class Car implements Identifiable {
    private String VIN;
    private String color;

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getID() {
        return VIN;
    }
}
