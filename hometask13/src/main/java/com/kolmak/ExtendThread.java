package com.kolmak;

public class ExtendThread extends Thread {

    ExtendThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.printf("%s started... \n", Thread.currentThread().getName());

        try {
            Thread.sleep(2_000);
        } catch (InterruptedException e) {
            System.out.printf("%s has been interrupted", Thread.currentThread().getName());
        }

        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}
