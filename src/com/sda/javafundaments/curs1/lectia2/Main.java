package com.sda.javafundaments.curs1.lectia2;

public class Main {

    public static void main(String[] args) {
        int sumVar = sum(5, 5);
        int sumVar2 = sum(5,10);

        int integer = 10;
        short interegAsShort = (short) integer;

        boolean isJavaLanguage = true;
        System.out.println("Is java language " + isJavaLanguage);


//        System.out.println("Sum =" + sumVar + " Sum 2= " + sumVar2);

        //type      //name           //name
        int         index           = 0;
        int         index1;

//        System.out.println("Index = " + index);

        index1 = 1;
//        System.out.println("Index1 = " + index1);

        char characterA = 'a';

        String helloWorld = "Hello world, \n \t \t Hey\" there";

        System.out.println(helloWorld);

//
//        System.out.println(sumVar);
//        System.out.println(sumVar2);
//
//        String inUpperCase = toUpperCase("hello world");
//        System.out.println(inUpperCase);

    }

    public static void sum2(int a, int b){
        System.out.println(a+b);
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static String toUpperCase(String param) {
        return param.toUpperCase();
    }

}
