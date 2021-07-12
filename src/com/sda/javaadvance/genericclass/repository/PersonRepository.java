package com.sda.javaadvance.genericclass.repository;

import com.sda.javaadvance.genericclass.model.Person;

public class PersonRepository extends  IdentifiableRepository<Person>{
    public Person getPersonByName(String name){
        for (Person person : items){
            if(person.getName().equals(name)){
                return person;
            }
        }
        return null;
    }
}
