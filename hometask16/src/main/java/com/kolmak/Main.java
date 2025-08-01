package com.kolmak;
import com.kolmak.domain.Worker;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.*;


public class Main {
    public static void main(String[] args) {

        /**
         * Задание 1.
         * При помощи lambda необходимо создать реализации для основных функциональных интерфейсов
         */

        // Predicate
        Predicate<String> predicate1 = s -> s.startsWith("J");
        Predicate<String> predicate2 = s -> s.startsWith("N");
        Predicate<String> predicate3 = s -> s.endsWith("A");

        Predicate<String> predicate = predicate1.or(predicate2).and(predicate3);

        System.out.println(predicate.test("JAVA"));
        System.out.println(predicate.test("NADYA"));
        System.out.println(predicate.test("JACK"));
        System.out.println(predicate.test("NICK"));
        System.out.println(predicate.test("PASHA"));

        // Consumer
        Consumer<Worker> consumer1 = (s) -> System.out.println("Come: " + s.toString());
        Consumer<Worker> consumer2 = (s) -> System.out.println("Left: " + s.toString());

        consumer1.andThen(consumer2).accept(new Worker(1000));

        //Supplier
        Supplier<Double> supplier = () -> (double) Math.round(Math.random() * 10);

        System.out.println(supplier.get());

        //Function
        Function<Integer, String> function = (i) -> {
            if(i > 0) {
                return "Positive number";
            } else if (i < 0) {
                return "Negative number";
            } else {
                return "Zero";
            }
        };

        System.out.println(function.apply(5));
        System.out.println(function.apply(-5));
        System.out.println(function.apply(0));

        /**
         * Задание 2.
         * Так же необходимо создать класс Worker (с полем зарплата) и заполнить TreeSet,
         * в качестве Comparator передать lambda - которая сортирует по величине зарплаты
         */
        TreeSet<Worker> workers = new TreeSet<>(Comparator.comparingInt(Worker::getSalary));

        workers.add(new Worker(1000));
        workers.add(new Worker(2000));
        workers.add(new Worker(3000));
        workers.add(new Worker(1500));
        workers.add(new Worker(2500));
        workers.add(new Worker(3500));

        System.out.println(workers);

    }
}