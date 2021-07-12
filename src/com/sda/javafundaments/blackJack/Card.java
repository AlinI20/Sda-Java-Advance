package com.sda.javafundaments.blackJack;

public class Card {
    private int value;
    private String type;
    private String suit;


    public Card(int value, String type,String suit){
        this.value = value;
        this.type = type;
        this.suit = suit;

    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                ", type='" + type + '\'' +
                ", suit='" + suit + '\'' +
                '}' + "\n";
    }
}
