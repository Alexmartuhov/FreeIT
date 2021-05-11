package com.Homework9;

public class ExceptionCar extends Exception {

    private String message;

    public ExceptionCar() {
        this.message = "Не завелась";
    }

    public String getMessage() {
        return message;
    }

}

