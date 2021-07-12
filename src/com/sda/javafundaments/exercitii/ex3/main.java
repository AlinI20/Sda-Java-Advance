package com.sda.javafundaments.exercitii.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");
        List<Contact> agenda = new ArrayList<>();

        boolean runAgain = true;
        while (runAgain == true) {

            System.out.println("Select an anction : [1] Add contact | [2] Show agenda");
            int action = scanner.nextInt();

            switch (action) {

                case 1: {
                    System.out.println("Please inser name");
                    String name = scanner.next();
                    System.out.println("Please inser email address");
                    String email = scanner.next();
                    Contact contact = new Contact(name, email);
                    if(agenda.contains(contact)){
                        System.out.println("User already exist in agenda");
                    }else{
                        agenda.add(contact);
                    }
                    break;
                }
                case 2: {
                    System.out.println("Agenda size is " + agenda.size());
                    for (Contact contact : agenda) {
                        System.out.println(contact);
                    }
                }
            }
            System.out.println("Do you want  to run the code again? Y/N");
            String repeat = scanner.next();

        }

    }
}