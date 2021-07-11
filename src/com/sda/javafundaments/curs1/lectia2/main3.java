package com.sda.lectia2;

public class main3 {
 public static void main(String args[]) {
    String test2 = null;
    int a = 5;
    int b = 5;
    System.out.println("Equality check : " + (a == b));
    System.out.println("Greater than: " + (a > b));
    System.out.println("Greater or equal than: " + (a >= b));

    a = 6;
    b = 4;
    System.out.println("Less than: " + (a < b));
    System.out.println("Less than or equal: " + (b <= a));

    boolean active = true;
    System.out.println(active);
    System.out.println(!active);


    System.out.println("------------------------------");
    boolean firstCondition = true;
    boolean secondCondition = false;

    System.out.println("firstCondition && secondCondition" + (firstCondition && secondCondition));
    System.out.println("firstCondition || secondCondition" + (firstCondition || secondCondition));
    // true && !false ===> true && true
    System.out.println("firstCondition && !secondCondition" + (firstCondition && !secondCondition));


    boolean netflixSubscription = true;

    checkNetflixSubscription(netflixSubscription);
    checkNetflixSubscription(!netflixSubscription);
    findMaxNumberBetween(6, 4);
    findMaxNumberBetween(4, 6);
    findMaxNumberBetween(5, 5);

    String isAdult = isUserAdult(18);

    findMinNumberBetween(6, 1);
    getDiscountByWeekday("Luni");
    getDiscountByWeekday("Miercuri");
    getDiscountByWeekday("Sambata");

    openHotelRoomByNumber(1);
    openHotelRoomByNumber(99);
    sayHelloNTimes(5);

    System.out.println("================================");
    showAllNumbersBetween1To10();

//        infiniteLoop();

    System.out.println("================================");
    showTwoByTwoNumbers();
    makeSumBetweenOneAndTen();

    makeSumBetweenTheNumbersAandB(2,4); // 2 + 3 + 4 = 9
    makeSumBetweenTheNumbersAandB(10000, 15000);
}

    public static void findMinNumberBetween(int a, int b) {
        if (a < b) {
            System.out.println(" a is less than b, value =" + a);
        } else {
            System.out.println(" b is less than a, value = " + b);
        }
    }

    public static void checkNetflixSubscription(boolean netxflixSubscription) {
        if (netxflixSubscription == true) {
            System.out.println("You have access");
        } else {
            System.out.println("Go the site to register");
        }
    }

    public static void findMaxNumberBetween(int a, int b) {
        System.out.println("Computing bigger number...");
        if (a == b) {
            System.out.println(" a == b, value = " + a);
        } else if (a > b) {
            System.out.println("a is the bigger value=" + a);
        } else {
            System.out.println("b is the bigger value =" + b);
        }
    }

    public static String isUserAdult(int age) {
        String text;
        if (age >= 18) {
            text = "adult";
        } else {
            text = "underage";
        }
        return text;
    }

    public static void getDiscountByWeekday(String day) {
        switch (day) {
            default:
                System.out.println("----------");
                System.out.println("No discount");
                System.out.println("----------");
                break;
            case "Luni":
                System.out.println("----------");
                System.out.println("Discout 5%");
                System.out.println("----------");
                break;
            case "Marti":
                System.out.println("----------");
                System.out.println("Discout 3%");
                System.out.println("----------");
                break;
            case "Miercuri":
                System.out.println("----------");
                System.out.println("Discout 10%");
                System.out.println("----------");
                break;
        }
    }

    public static void openHotelRoomByNumber(int number) {
        switch (number) {
            case 1:
                System.out.println("Opened door with number 1");
                break;
            case 2:
                System.out.println("Opened door with number 2");
                break;
            case 45:
                System.out.println("Opened door with number 45");
                break;
            default:
                System.out.println("Rooms are booked by somebody else");
                break;
        }
    }

    public static void sayHelloNTimes(int numberOfTimes){
        //tipul variabilei   numele/valoarea        conditia de iesire              //incrementarea indexului
        for     (int            index=0;                index<numberOfTimes;            index++) {
            System.out.println(index + " Hello world");
        }
    }

    public static void showAllNumbersBetween1To10() {
        for (int index=1; index<=10; index++) {
            if (index == 6) {
                System.out.println("====HIT NUMBER 6===");
            } else {
                System.out.println(index);
            }
        }
    }

    public static void infiniteLoop() {
        int i = 0;
        for (;;) {
            System.out.println("to infinity" + i);
            i = i+1;
        }
    }

    public static void showTwoByTwoNumbers() {
        for (int index=0; index<=20; index = index +2) {
            System.out.println(index);
        }
    }

    /**
     *
     *
     *          SUM             |           INDEX
     *          0                           1
     *          1                           2
     *          3                           3
     *          6                           4
     *          10                          5
     *          .
     *          .
     *          .
     *          .
     */
    public static void makeSumBetweenOneAndTen() {
        int sum=0;
        for (int index=1; index<=10; index++) {
            sum = sum +index;
            System.out.println(" Sum at iteration " + index + " is " + sum);
        }
        System.out.println(sum);
    }

    /**
     * Utilizatorul trimite 2 parametrii la metoda care sunt in primul
     * rand validati (a nu trebuie sa fie mai mare decat b)
     * Dupa care rulam un for pornind de la a pana la b
     */
    public static void makeSumBetweenTheNumbersAandB(int a, int b) {
        if (a>b) {
            System.out.println("Please introduce correct range of numbers");
        } else {
            int sum = 0;
            for (int index=a; index<=b; index++) {
                sum = sum +index;
            }
            System.out.println(sum);
        }
    }
}