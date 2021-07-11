package com.sda.recap.scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\\n");
        String name = scanner.next();
        int intVariable = scanner.nextInt();
        double doubleVariable = scanner.nextDouble();

        // obiecte wrapper
        // primitiva int - avem obiectul Integer
        // primitiva double - avem obiectul Double
        // primitiva char - avem obiectul Character

        List<Character> listOfCharacters = new ArrayList<>();
        listOfCharacters.add('s');
        listOfCharacters.add('d');
        listOfCharacters.add('a');
        listOfCharacters.add('!');

        isContained(listOfCharacters, '!');

    }

    // complexitate : O(n) unde n este diminesiunea listei
    // [ 1, 2, 3  ......., 10000]
    //     / /              /
    // [ 2, 3 ..........,10000]
    public static boolean isContained(List<Character> characters, char toBeFound) {
        boolean found = false;
        for(Character character : characters) {
            if (character.equals(toBeFound)) {
                found = true;
            }
        }
        return found;
    }
}
