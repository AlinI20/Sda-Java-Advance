package com.sda.javaadvance.conccurancy.ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<Employee> LIST_OF_EMPLOYEES = new ArrayList<Employee>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            LIST_OF_EMPLOYEES.add(new Employee("\nEmployee" + i));
        }
        for (Employee e : LIST_OF_EMPLOYEES) {
            e.start();
        }
        for (Employee e : LIST_OF_EMPLOYEES) {
            try {
                Thread.sleep(300);
                e.stopEmployee();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
