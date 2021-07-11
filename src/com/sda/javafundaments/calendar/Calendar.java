package com.sda.calendar;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Calendar {
    List<Event> events = new ArrayList<>();

    public void addEvent(Event event){
        events.add(event);
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "events=" + events +
                '}';
    }
    public void getPastEvent(){
        for (Event event:events){
            if (event.date.isBefore(LocalDate.now())){
                getPastEvent().add(event);
                return; getPastEvent();
            }
        }
    }
}
