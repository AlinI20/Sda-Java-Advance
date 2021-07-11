package com.sda.recap.structures;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void mainWithFor(String[] args) {
        String[] names = {"Bill", "Elon"};
        for(int i=0; i< names.length; i++){
            System.out.println(names[i]);
        }

        int[] numbers = {1,2,3,4,5,6};

        // pentru fiecare
        int sum = 0;
        for(Integer n: numbers){
            sum = sum + n;
        }
        System.out.println(sum);
    }

    public static void mainWithWhile(String[] args) {
        int i = 0;
        while(i<3) {
            System.out.println("i = " + i);
            i++;
        }
    }

    public static void mainWithDoWhile(String[] args) {
        boolean run = false;
        do {
            System.out.println("Running..");
        } while (run);

        while(run) {
            System.out.println("Running in normal while...");
        }
    }


    // if / else if / elses
    public static void mainWithIf(String[] args){
        if (isTrue()) {
            System.out.println("In if...");
        } else {
            System.out.println("In else..");
        }

    }

    public static void mainSwitch(String[] args) {
        String name = "test";
        int option = 1;
        switch (option) {
            case 1 : {
                System.out.println("Printing 1....");
                break;
            }
            case 2 : {
                System.out.println("Printing 2....");
                break;
            }
            default:
                System.out.println("User came here with option " + option);
                break;
        }

        System.out.println("Outside switch");
    }

    public static void main(String[] args) {
        for (int i=0; i < 10; i++) {
            if ( i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static boolean isTrue() {
        return true;
    }
}