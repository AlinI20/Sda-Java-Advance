package com.sda.exercitii.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert [1] : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Insert [2]");
        List<String> validOperator = new ArrayList<>();
        validOperator.add("+");
        validOperator.add("-");
        validOperator.add("*");
        validOperator.add("/");
        System.out.println("Select operation : ");
        String operation = sc.next();
        while (!validOperator.contains(operation)) {
            System.out.println("Enter a valid operation");
            operation = sc.next();
        }
        switch (operation) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*": {
                System.out.println(a * b);
                break;
            }
            case "/": {
                if (b == 0) {
                    System.out.println("operation not possible");
                } else {
                    System.out.println(a / b);
                    break;
                }

            }

        }
    }
}