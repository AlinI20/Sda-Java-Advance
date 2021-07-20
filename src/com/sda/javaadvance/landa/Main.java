package com.sda.javaadvance.landa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

//Write a program that reads a collection of strings, separated by one or more whitespaces, from the console and then prints
//them onto the console. Each string should be printed on a new line. Use a Consumer<T>.
//- Input: Pesho Gosho Adasha
//- Output:
//  - Pesos
//  - Gosu
//  - Gang
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a phrase");
        String line = scanner.nextLine();
        String[] worlds = line.split(" ");
        List<String> worldList = new ArrayList<>();
        for (String world : worlds) {
            String newWorld = world.trim();
            if (!newWorld.isEmpty()) {
                worldList.add(newWorld);
            }
        }
        processWorld(worldList,
                System.out::println,
                world -> world.toUpperCase(Locale.ROOT));
    }

    public static void processWorld(List<String> worldList,
                                    Consumer<String> worldConsumer,
                                    Function<String, String> worldTransform
    ) {
        for (String world : worldList) {
            worldConsumer.accept(worldTransform.apply(world));
        }
    }
}
