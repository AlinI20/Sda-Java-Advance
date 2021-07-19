package com.sda.javaadvance.threads;

public class ThreadGc implements Runnable{
    @Override
    public void run() {
        System.gc();
        System.runFinalization();
        System.out.println("Garbage collector has been invoked");
    }
}
