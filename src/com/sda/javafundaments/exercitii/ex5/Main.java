package com.sda.exercitii.ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // citim cu ajutorul scannerului informatii din terminal
        List<ContactInfo> contactInfos = new ArrayList<>(); // difernta intre arraylist si arrey de obecte ,este c
        //lista isi face resize automat

        System.out.println("Please select an action: [1] Add contact [2] See all contacts [3] Exit");
        int action = scanner.nextInt();

        while (action == 1 || action == 2) {
            switch (action) {
                case 1:
                    System.out.println("Please insert your contact name : ");
                    String contactName = scanner.next();
                    System.out.println("Plese insert your contact phone number : ");
                    String phoneNumber = scanner.next();

                    System.out.println(contactName + " " + phoneNumber);

                    ContactInfo terminalContactInfo = new ContactInfo(contactName, phoneNumber);

                   contactInfos.add(terminalContactInfo);

                    System.out.println(terminalContactInfo);

                    System.out.println("creating contact info");
                    break;

                case 2:
                    //tipul obiectului  //nume obicet              //lista noastra
                    for(ContactInfo contactInfoAtCurrentIndex :  contactInfos) {
                        System.out.println(contactInfoAtCurrentIndex);
                    }
                    break;

                case 3:
                    System.out.println("Quiting program");
                    break;

                default:
                    System.out.println("quiting program");
                    break;
            }

            System.out.println("[1] add contact [2] See contact [3] Exit ");
            action =scanner.nextInt();
        }
    }



}
