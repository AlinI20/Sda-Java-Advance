package com.sda.exercitii.ex4.engine;

public class SpecialPlane extends Plain implements Float{
    public SpecialPlane(int numberOfEngines, int numberOfWings, String model, int speed, int capasity) {
        super(numberOfEngines, numberOfWings, model, speed, capasity);
    }

    @Override
    public void doFloat() {
        System.out.println("I m a special plain and i float");

    }

}
