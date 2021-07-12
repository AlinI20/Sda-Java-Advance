package com.sda.javafundaments.Browser;

public class Chrome extends Browser {
    String name = "chrome";
    String ads;

    public Chrome(int version,String ads){
        super("chrome" ,version);
        this.ads = ads;

    }

    @Override
    public void open() {
        System.out.println("Opening Chrome " + this.version + " With add " + this.ads);
    }
}
