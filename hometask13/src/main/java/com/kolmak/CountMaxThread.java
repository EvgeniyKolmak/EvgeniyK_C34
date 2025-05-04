package com.kolmak;

public class CountMaxThread extends Thread{

    private int[] array;


    public CountMaxThread(int[] array, String name) {
        super(name);
        this.array = array;
    }

    @Override
    public void run() {
        System.out.printf("%s is started ...\n", Thread.currentThread().getName());

        try {
            Thread.sleep(2_000);
            System.out.println("Max number is " + maxNumber(array));
        } catch (InterruptedException e) {
            System.out.printf("%s has been interrupted", Thread.currentThread().getName());
        }

        System.out.printf("%s is finished ...\n", Thread.currentThread().getName());
    }

    public int maxNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        return max;
    }

}
