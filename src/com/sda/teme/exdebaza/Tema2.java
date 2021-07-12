package com.sda.teme.exdebaza;

public class Tema2 {
    public static void main(String[] args) {

        System.out.println("Largest in givven array is " + largest());
        System.out.println("Lowest in given arrat is " + lowest());
        System.out.println("Integer is " + getInteger());
        int[] arr3 = {1, 2, 2, 4, 1, 1, 1, 2, 5, 1, 0};
        int[] replaceNumbersWithZero = replaceNumbersWithZero(arr3);
        for (int element : replaceNumbersWithZero) {
            System.out.print(element);
        }
        System.out.println();
    }

    public static int arrey[] = {1, 53, 2, 5, 8, 9, 331, 0};

    static int largest() {
        int index;
        int max = arrey[0];
        for (index = 0; index < arrey.length; index++)
            if (arrey[index] > max)
                max = arrey[index];
        return max;
    }

    public static int getArray[] = {1, 53, 2, 5, 8, 9, 331, 0};

    static int lowest() {
        int index;
        int max = getArray[0];
        for (index = 0; index >= getArray.length; index++)
            if (getArray[index] < max)
                max = getArray[index];
        return max;
    }

    public static int getInteger() {
        int x = 2;
        int index = 0;
        int[] arr1 = {1, 2, 2, 2, 4, 5, 8, 2, 9, 0};
        int[] arr2 = new int[arr1.length];
        for (index = 0; index < arr1.length; index++) {
            arr2[index] = arr1[index] + x;
            System.out.println(arr2[index]);
        }
        return index;

    }

    public static int[] replaceNumbersWithZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1)
                arr[i] = 0;
        }
        return arr;
    }

    public static int showXInarray[] = {1, 2, 3, 2, 2, 4, 1};

    static void Inarray() {



    }

}
