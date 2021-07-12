package com.sda.javaadvance.genericclass;

import com.sda.javaadvance.genericclass.model.Identifiable;
import com.sda.javaadvance.genericclass.model.Person;
import com.sda.javaadvance.genericclass.repository.IdentifiableRepository;

public class Main {
    public static void main(String[] args) {
        IdentifiableRepository<Person> personRepository = new IdentifiableRepository<>();
        Person person = new Person();
        person.setCNP("231456631");
        person.setName("David");
        personRepository.addItem(person);
        System.out.println(personRepository.getItemById("1"));
        System.out.println(personRepository.getItemById("231456631"));
        personRepository.removeItemByID("231456631");
        System.out.println(personRepository.getItemById("231456631"));

    }
}
