package com.sda.javaadvance.conccurancy.ex2;

import com.sda.javaadvance.conccurancy.ex2.client.ClientDeleter;
import com.sda.javaadvance.conccurancy.ex2.client.ClientWriter;
import com.sda.javaadvance.conccurancy.ex2.repository.PersonRepository;

public class Main {
    public static final PersonRepository PERSON_REPOSITORY = new PersonRepository();

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new ClientWriter().start();
        }
        for (int i = 0; i < 5; i++) {
            new ClientDeleter().start();
        }
    }
}