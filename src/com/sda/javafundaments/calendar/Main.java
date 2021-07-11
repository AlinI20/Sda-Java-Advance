package com.sda.calendar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        Scanner sc = new Scanner(System.in).useDelimiter("\\n");

        boolean addEvents = true;

        while (addEvents) {
            System.out.println("do you waunt to add event [1] yes [2] see past event");
            String option = sc.next();
            switch (option) {
                case "1": {
                    calendar.addEvent(createEvent(sc));
                }
                break;
                case "2": {
                    System.out.println(calendar);
                }
            }
        }
    }

    public static Event createEvent(Scanner sc) {
        String nameEv = sc.next();
        String dataEv = sc.next();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(dataEv, dateTimeFormatter);
        Event event = new Event(nameEv, localDate);
        return event;
    }
}
