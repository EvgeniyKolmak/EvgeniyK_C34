package org.example.service;

import org.example.exception.WrongLoginException;
import org.example.exception.WrongPasswordException;

public class ValidationService {

    public static void validate(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("'Login' должен быть меньше 20 символов и не должен содержать пробелы.");
        }

            if (password.length() >= 20 || password.contains(" ") || !password.matches(".*\\d+.*") || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("'Password' должен быть меньше 20 символов, не должен содержать пробелы и должен содержать хотя бы одну цифру. Также password и confirmPassword должны быть равны.");
        }

    }

}
