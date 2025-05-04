package com.kolmak;

public class CountMinThread extends Thread {

    private int[] array;


    public CountMinThread(int[] array, String name) {
        super(name);
        this.array = array;
    }

    @Override
    public void run() {
        System.out.printf("%s is started ...\n", Thread.currentThread().getName());

        try {
            Thread.sleep(2_000);
            System.out.println("Min number is " + minNumber(array));
        } catch (InterruptedException e) {
            System.out.printf("%s has been interrupted", Thread.currentThread().getName());
        }

        System.out.printf("%s is finished ...\n", Thread.currentThread().getName());
    }

    public int minNumber(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        return min;
    }

}
