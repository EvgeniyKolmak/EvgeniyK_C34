package com.kolmak;

public class Main {
    public static void main(String[] args) {

        /*
        * Задача 1)
        * Создать поток используя два способа - через наследованное и имплементируя интерфейс Runnable
        * Оба потока должны стартовать, после чего основной поток должен дождаться их завершения и прекратить работу.
        */
        System.out.println("Main thread started...");
        ExtendThread thread1 = new ExtendThread("ExtendThread");
        Thread thread2 = new Thread(new ImplThread(), "ImplThread");
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            System.out.println("Thread has been interrupted");
        }
        System.out.println("Main thread finished...");


        /*
        * Задача 2)
        * Есть массив целых чисел.
        * Необходимо создать два потока - один из которых будет считать максимальное значение, а второй - минимальное.
        * Запустить оба потока и дождаться их окончания. Вывести на экран результат вычислений.
        */
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        CountMinThread  minThread = new CountMinThread(array, "MinThread");
        CountMaxThread maxThread = new CountMaxThread(array, "MaxThread");
        minThread.start();
        maxThread.start();
        try {
            minThread.join();
            maxThread.join();
        } catch (InterruptedException ex) {
            System.out.println("Thread has been interrupted");
        }


        /*
        * Задача 3)
        * Создать поток демон и проверить его работу
        */
        ExtendThread daemon = new ExtendThread("new");

        daemon.setDaemon(true);
        daemon.start();

        if(daemon.isDaemon()) {
            System.out.println("Work like background process");
        }
    }
}