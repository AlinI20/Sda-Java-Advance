package com.sda.exercitii.ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Exchange {
    public static void main(String[] args) {
        boolean runAgain = true;
        Scanner sc = new Scanner(System.in);

        List<String> suppoertedPairs = new ArrayList<>();
        suppoertedPairs.add("RON -EUR");
        suppoertedPairs.add("RON-USD");
        suppoertedPairs.add("EUR-RON");

        while (runAgain == true) {
            System.out.println("Supported pairs: ");
            int i = 1;
            for (String pair : suppoertedPairs) {
                System.out.println(i + " " + pair);
                i++;
            }

            System.out.println("Please insert a value: ");
            int inputValue = sc.nextInt();
            while (inputValue > suppoertedPairs.size() || inputValue == 0) {
                System.out.println("Please inser a vaold option!");
                inputValue = sc.nextInt();
            }
            System.out.println("Inser a value: ");
            double amount = sc.nextDouble();


            switch (inputValue) {
                case 1:
                    System.out.println(amount / 4.92);
                    break;
                case 2:
                    System.out.println(amount / 4.5);
                    break;
                case 3:
                    System.out.println(amount * 4.92);
            }
            System.out.println("Do you want to run another conversion? Y/N");
           String userRespons = sc.next();
           if(userRespons.equals("Y")) runAgain = true;else runAgain = false;

        }
        System.out.println("Exit");
    }
}
