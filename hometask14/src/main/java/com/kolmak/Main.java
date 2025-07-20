package com.kolmak;

import com.kolmak.domain.Order;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
         * Задание 1
         * Необходимо создать числовой список. Из данного списка необходимо получить новый, который будет содержать только четные числа.
         * */

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Первоначальный список: " + list);


        List<Integer> newList = new ArrayList<>();

        for (Integer number : list) {
            if(number % 2 == 0){
                newList.add(number);
            }
        }

        System.out.println("Список только из чётных чисел: " + newList);


        /*
         * Задание 1
         * Создайте объект - заказ (поля - идентификатор, название, статус).
         * Добавьте несколько заказов в set. Создайте еще один заказ, который эквивалентный одному из существующих.
         * Добавьте его к set. Проверьте что добавления не произошло.
         * */

        Set<Order> orderSet = new HashSet<>();

        Order order1 = new Order(1, "Order 1", "В ожидании");
        Order order2 = new Order(2, "Order 2", "Выполнен");
        Order order3 = new Order(3, "Order 3", "Отменён");

        orderSet.add(order1);
        orderSet.add(order2);
        orderSet.add(order3);

        System.out.println("Список заказов: " + orderSet);
        System.out.println("Кол-во заказов: " + orderSet.size());

        Order order4 = new Order(1, "Order 1", "В ожидании");

        System.out.println(orderSet.add(order4));

        System.out.println("Список заказов: " + orderSet);
        System.out.println("Кол-во заказов: " + orderSet.size());



    }
}