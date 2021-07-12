package com.sda.javafundaments.curs1.lectia2;


public class Laborator3 {

    public static void main(String[] args){
        arrayWithInts();
    }

    public static void whileExample() {
        int max = 10;
        int i = 0;

        while(i<=max) {
            System.out.println("Index is = " + i);
            i++;
        }

        System.out.println("Index outside of while condition " + i);
    }

    public static void whileExampleWithBooleanValue() {
        boolean netflixSubscription = true;

        int counter = 0;
        while(netflixSubscription == true) {
            System.out.println("Subscription is still valid");
            if (counter > 3) {
                netflixSubscription = false;
            }
            counter++;
        }
    }


    public static void doWhileExample() {
        do {
            System.out.println("Hello world");
        } while (false);
    }

    // index 0 1 2 3 4 5 6
    // val   1 2 3 4 5 6 7
    //
    //
    public static void daysOfWeek() {
        int[] daysOfWeekIndexes = new int[7];
        daysOfWeekIndexes[0] = 1;
        daysOfWeekIndexes[1] = 2;
        daysOfWeekIndexes[2] = 3;
        daysOfWeekIndexes[3] = 4;
        daysOfWeekIndexes[4] = 5;
        daysOfWeekIndexes[5] = 6;
        daysOfWeekIndexes[6] = 7;

        for (int index=0; index<daysOfWeekIndexes.length; index++){
            System.out.println("At index = " + index + " we have value = " + daysOfWeekIndexes[index]);
        }
    }

    public static void arrayWithNames() {
        String[] names = new String[3];
        names[0] = "Mike";
        names[1] = "Tonny";
        names[2] = "Elon";

        for (int index=0; index<names.length; index++) {
            System.out.println(names[index].toUpperCase());
        }

        System.out.println("Print line outside the for " + names[1]);

        System.out.println("Print line outside of the for " + names[3]);
    }

    public static void arrayWithNamesWithDirectInitialization() {
        String[] names = {"Mike", "Tonny", "Elon"};
        for (int index=0; index<names.length; index++) {
            System.out.println(names[index]);
        }
    }

    public static void arrayWithInts() {
        int[] arrayWithNumbers = {25,631, 1, 10, 664};
        int sum = 0;
        for (int index=0; index<arrayWithNumbers.length; index++) {
            sum = sum + arrayWithNumbers[index];
        }

        int[] withThreeElements = {1,2,3};
        int[] withFourElements = {1,1,2,3};
        System.out.println("Length of first array is = " + withThreeElements.length);
        System.out.println("Length of second array is = " + withFourElements.length);
    }
}
//Se da un array int[] = {1,53,2,5,8,9,331, 0}. Sa  se implementeze o metoda care returneaza cel mai mare numar din array.