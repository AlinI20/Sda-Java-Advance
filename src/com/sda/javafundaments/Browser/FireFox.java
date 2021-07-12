package com.sda.javafundaments.Browser;

public class FireFox extends Browser {
    boolean privacy = false;

    public FireFox(int version, boolean privacy){
        super("FireFox", version);
        this.privacy = privacy;

    }

    @Override
    public void open() {
        System.out.println("opening FireFox With privacy " + this.privacy);
    }
}


