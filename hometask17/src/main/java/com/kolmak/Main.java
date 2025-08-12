package com.kolmak;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numberlist = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 1) вывести только четные
        List<Integer> evenList = numberlist.stream()
                .filter(i -> i % 2 == 0)
                .toList();

        System.out.println("Чётные числа: " + evenList);

        // 2) получить коллекцию без дубликатов (используя distinct)
        List<Integer> distinctNumbers = numberlist.stream()
                .distinct()
                .toList();

        System.out.println("Коллекция без дубликатов: " + distinctNumbers);

        // 3) получить сумму всех чисел
        int result = numberlist.stream()
                    .reduce(0, (subtotal, element) -> subtotal + element);

        int result1 = numberlist.stream()
                    .mapToInt(Integer::intValue)
                    .sum();

        System.out.println("Общая сумма: " + result1);

        // 4) получить максимальный элемент в коллекции
        numberlist.stream()
                .max(Integer::compareTo)
                .ifPresent(el -> System.out.println("Максимальное числа: " + el));

        // 5) найти первый элемент, который больше 10
        numberlist.stream()
                .filter(el -> el > 10)
                .findFirst()
                .ifPresentOrElse(
                        el -> System.out.println("Первый элемент который больше 10: " + el),
                        () -> System.out.println("В коллекции нет чисел больше 10.")
                );

        // 6) определить все ли числа делятся на 10 без остатка
        boolean b = numberlist.stream()
                .allMatch(i -> i % 10 == 0);

        System.out.println("Все ли числа делятся на 10 без остатка: " + (b ? "Да" : "Нет"));

        List<String> stringList = List.of("Hello", "World", "!", "My", "Name", "Rapunzel");

        // 7) получить коллекцию чисел, каждой число которого - длинна строки исходной коллекции
        List<Integer> list = stringList.stream()
                .map(String::length)
                .toList();

        System.out.println("Коллекция длин строк: " + list);

        // 8) получить коллекцию строк, где все элементы приведены к верхнему регистру
        List<String> list1 = stringList.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println("Коллек ция строк в верхнем регистре: " + list1);


        // 9) получить коллекцию строк, в которой нет элементов с буквой "a"
        List<String> a = stringList.stream()
                .filter(s -> !s.contains("a"))
                .toList();

        System.out.println("Коллекция слов без 'a': " + a);

    }
}