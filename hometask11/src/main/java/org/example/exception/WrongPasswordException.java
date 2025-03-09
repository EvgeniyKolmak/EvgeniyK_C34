package org.example.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class WrongPasswordException extends Exception{

    private String message;

    public WrongPasswordException(String message) {
        super(message);
    }

}
