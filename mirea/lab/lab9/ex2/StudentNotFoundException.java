package ru.mirea.lab.lab9.ex2;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String errMsg) {
        super(errMsg);
    }
}