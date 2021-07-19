package com.sda.javaadvance.threads;

public class ThreadA extends Thread {
    private String customMessage;

    public ThreadA(String customMessage) {
        this.customMessage = customMessage;
    }

    @Override
    public void run() {
        System.out.println("Hi i am thread A");
        try {
            for (int i = 0; i < 50; i++) {
                Thread.sleep(100);
                System.out.println(customMessage);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
