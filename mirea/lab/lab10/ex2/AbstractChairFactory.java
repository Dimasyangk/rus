package ru.mirea.lab.lab10.ex2;

public interface AbstractChairFactory {

    VictorianChair createVictorianChair(int age);

    MagicalChair createMagicalChair();

    FunctionalChair createFunctionalChair();
}