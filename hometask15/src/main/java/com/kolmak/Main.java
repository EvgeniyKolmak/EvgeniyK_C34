package com.kolmak;



import com.kolmak.domain.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        /*
         * Задание 1
         * Есть коллекция пользователей.
         * У каждого пользователя есть уникально поле - login.
         * Необходимо на основе данной коллекции создать map где ключ - это логин,
         * а значение сам объект пользователь.
         * */
        List<User> users = List.of
                (new User("Ben"),
                        new User("Sam"),
                        new User("Dean"),
                        new User("Den")
                );


        Map<String, User> userMap = new HashMap<>();

        for(User user : users) {
            userMap.put(user.getLogin(), user);
        }

        System.out.println("Map of users: " + userMap);


        /*
         * Задание 2
         * Есть массив слов.
         * Необходимо создать map где ключ - это слово из массива, а значение - это его длинна.
         * */

        String[] words = {"Ben", "Sam", "Dean", "Den"};

        Map<String, Integer> wordMap = new HashMap<>();

        for(String word : words) {
            wordMap.put(word, word.length());
        }

        System.out.println("map of words: " + wordMap);

    }
}