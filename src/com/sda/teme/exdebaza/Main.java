package com.sda.teme.exdebaza;

public class Main {
    public static void main(String[] args) {
        int num1 = 87, num2 = 53, sum;
        sum = num1 + num2;
        System.out.println("Sum of these numbers : " +sum);
    }
    public static void getMultiply(){
        int num1 = 325, num2 = 50, product;
        product = num1 * num2;
        System.out.println("The product of given two numbers is : " + product);
    }
    public static void getDivideTowNumbers(){
        int num1 = 56, num2 = 7, result;
        result = num1/num2;
        System.out.println("Division of " +num1+ " and " +num2+ " is " +result);
    }
    public static void getSubstraction(){
        int num1= 231, num2= 423, rezult;
        rezult=num2-num1;
        System.out.println("Substraction of integres is " +rezult);
    }
    public static void getStringLength(){
        String str ="Obiect Zburator Neidentificat";
        int length = str.length();
        System.out.println("String is " + length);
    }
    public static void getCaracter(){
        String str = "Telefon";
        char first = str.charAt(0);
        char last = str.charAt(str.length()-1);
        System.out.println("Prima litera : "+first);
        System.out.println("Ultima litera : " +last);
    }


}
