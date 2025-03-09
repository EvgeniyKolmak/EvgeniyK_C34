package org.example.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class WrongLoginException extends Exception {

    public WrongLoginException(String message) {
        super(message);
    }



}
