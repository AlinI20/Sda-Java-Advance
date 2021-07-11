package com.sda.calendar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Event {
     String name;
     LocalDate date;

    public Event(String name,LocalDate date){
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE-dd-MM-yyyy");
        return "Event" +
                "name='" + name + '\'' +
                ", date=" + date + date.format(dateTimeFormatter) +
                '}';
    }
}
