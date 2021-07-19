package com.sda.javaadvance.conccurancy.ex2.repository;

import com.sda.javaadvance.conccurancy.ex2.model.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PersonRepository {
    private Map<Integer, Object> locks = new ConcurrentHashMap<>();
    private Map<Integer, Person> personsByID = new HashMap<>();
    private Map<String, Integer> personIdByName = new HashMap<>();
    private Map<String, Integer> personIDByAddress = new HashMap<>();
    private Map<String, Integer> personsIDByPhoneNumber = new HashMap<>();


    public void addPerson(Person person) {
        locks.putIfAbsent(person.getId(), new Object());
        synchronized (locks.get(person.getId())) {
            personsByID.put(person.getId(), person);
            personIDByAddress.put(person.getAddress(), person.getId());
            personsIDByPhoneNumber.put(person.getPhoneNumber(), person.getId());
            personIdByName.put(person.getName(), person.getId());
        }
    }

    public void deletePersonsById(Integer id) {
        locks.putIfAbsent(id, new Object());
        synchronized (locks.get(id)) {
            Person person = personsByID.get(id);
            if (person != null) {
                personIdByName.remove(person.getName());
                personIDByAddress.remove(person.getAddress());
                personsIDByPhoneNumber.remove(person.getPhoneNumber());
                personsByID.remove(id);
            }
        }
    }

    public Person searchPersonByName(String name) {
        Integer id = personIdByName.get(name);

        if (id != null) {
            locks.putIfAbsent(id, new Object());
            synchronized (locks.get(id)) {
                id = personIdByName.get(name);
                if (id != null) {
                    Person person = personsByID.get(id);
                    return person;
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }
   public int getSize(){
        return personsByID.size();
    }
}
