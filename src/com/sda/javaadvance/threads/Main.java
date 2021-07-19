package com.sda.javaadvance.threads;

public class Main {
    public static void main(String[] args) {
        ThreadA thread = new ThreadA("first thread");
        thread.start();
        ThreadA thread1 = new ThreadA("second thread");
        thread1.start();

        Thread threadGb = new Thread(new ThreadGc());
        Thread threadGb1 = new Thread(new ThreadGc());
        threadGb.start();
        threadGb1.start();


    }
}
