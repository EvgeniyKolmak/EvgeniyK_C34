package org.example;

import org.example.exception.WrongLoginException;
import org.example.exception.WrongPasswordException;
import org.example.service.ValidationService;

public class MainApp {

    public static void main(String[] args) {
        String login = "qwerty";
        String password = "wrwqiuh12gsd";
        String confirmPassword = "wrwqiuh12gsd";

        try {
            ValidationService.validate(login, password, confirmPassword);
            System.out.println("Валидация прошла успешно");
        } catch (WrongLoginException e) {
            System.out.println("Ошибка при валидации: " + e.getMessage());
        } catch (WrongPasswordException ex) {
            System.out.println("Ошибка при валидации: " + ex.getMessage());
        }

    }

}
