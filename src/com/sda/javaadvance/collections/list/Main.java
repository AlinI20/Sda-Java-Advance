package com.sda.javaadvance.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> products = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String option = "";

        while (!option.equals("stop")) {

            System.out.println("Select option: ");
            option = scanner.nextLine();

            switch (option) {
                case "add product":
                    System.out.println("Insert product name");
                    String product = scanner.nextLine();
                    products.add(product);
                    break;
                case "remove product":
                    System.out.println("Insert the name of the product you want to remove");
                    String productToBeRemove = scanner.nextLine();
                    products.remove(productToBeRemove);
                    break;
                case "m"://displays products that start with m letter
                    for (String prod : products) {
                        if (prod.startsWith("m")) {
                            System.out.println(prod);
                        }
                    }
                    break;
                case "m2":
                    for (int i = 0; i < products.size(); i++) {
                        String prod = products.get(i);
                        if (prod.startsWith("m")) {
                            if (i > 0) {
                                System.out.println(products.get(i - 1));
                            }
                        }
                    }
                    break;
                case "stop":
                    System.out.println("Application exit");
                    break;
                default:
                    System.out.println("Invalid option");
            }

        }

    }
}
