package com.sda.recap;


import com.sda.recap.inheritance_poly.Employee;
import com.sda.recap.inheritance_poly.Person;

/**
 * Inheritance / Mostenire
 *      - clasele copil mostenesc atat field-urile cat si metodele din clasa parinte
 *      - Relatia de mostenire se realizeaza prin keyword-ul extends
 *      - Nu putem mosteni mai multe clase
 * Polymorphism
 *      - Abilitatea unui obiect de a se comporta diferit in functie de felul in care a fost instantiat
 *      - De exemplu in ierarhia Person si Employee, metoda de write() se comporta diferit
 *      - Se obtine prin override (supra scrierea unei metode din clasa parinte sau interfata)
 *      - Se poate obtine si prin overload
 * Abstractizare
 *      - Se obtine cu ajutorul unei clase abstracte sau unei interfete
 *      - In cazul unei clase abstracte trebuie sa facem override la metodele abstracte
 *      - Pentru metodele care au behaviour, fie il mostenim, fie il suprascriem (override)
 *      - Se poate obtine si cu ajutorul unei interfete (metodele definite in interfata)
 *      trebuie supracrise in clasele ce implementeaza acea interfata, de exemplu WriteInterface.
 * Encapsulare
 *      - Obtinem encapsularea cu ajutorul modificatorilor de acces (access modifiers)
 *      - public / private / default / protected
 *      - Cu ce ne ajuta ?
 *      - Pentru a limita accesul la anumite informatii dintr-o clasa
 *      - Pentru a valida anumite valori ce urmeaza sa fie setate
 *
 *  A PIE
 *
 */
public class Main {

    public static void main1(String[] args) {
	// write your code here
        int variableName = 5;
        //short --> int --> long

        System.out.println("Integer max value" + Integer.MAX_VALUE);

        short shorVariable = (short) Integer.MAX_VALUE;
        System.out.println("Short variable with Integer max value " + shorVariable);

        System.out.println("Long max value " + Long.MAX_VALUE);
        int intValue = (short) Long.MAX_VALUE;
        System.out.println("Int variable with long max value" + intValue);

        int a = 5;
        int b =5;

        if (a == b) {
            System.out.println("a is equal to b");
        }

    }

    public static void main2(String[] args) {
        Person person = new Person(25);
        person.write("I'm a person and I write");

        Person.doStaticWork();

        Employee employee = new Employee();
        employee.write("I'm an employee");
    }

    public static void main3(String[] args) {
        Person person = new Person(25);
        Person employee = new Employee();

        person.write(" I'm a normal person..");
        employee.write(" I'm an employee...");
    }

}
