package com.sda.shopapp.model;

public enum CustommerState {
    NEW("NEW",false),
    ACTIVE("ACTIVE",true),
    CLOSED("CLOSED",false),
    BANNED("BANNED",false);

    String prettyName;
    boolean isShoppingActive;

    CustommerState(String prettyName,boolean isShoppingActive) {
        this.prettyName = prettyName;
        this.isShoppingActive = isShoppingActive;
    }

    @Override
    public String toString() {
        return (prettyName);
    }
    public boolean isShoppingActive(){
        return isShoppingActive;
    }

}