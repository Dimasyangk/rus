package ru.mirea.lab.lab10.ex2;

public class FunctionalChair implements Chair {

    public void doFunction() throws Exception {
        System.out.println("Функциональный стул очень удобен*");
        throw new Exception("[ERROR]: Функциональный стул сломался");
    }

    @Override
    public String toString() {
        return "FunctionalChair очень удобен";
    }
}
