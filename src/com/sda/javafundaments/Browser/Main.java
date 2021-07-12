package com.sda.javafundaments.Browser;

public class Main {
    public static void main(String[] args) {
        Browser chrome = new Chrome(32, "Salut");
        Browser fireFox = new FireFox(62, true);
        Browser[] browsers = {chrome, fireFox};
        for (int i = 0; i < browsers.length; i++) {
            browsers[i].open();
        }


    }
}


