package ru.mirea.lab.lab9.ex1;

public class InvalidINNException extends Exception {
    InvalidINNException(String errMsg) {
        super(errMsg);
    }
}