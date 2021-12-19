package ru.mirea.lab.lab10.ex2;

public class ChairFactory implements AbstractChairFactory {

    public VictorianChair createVictorianChair(int age) {
        return new VictorianChair(10);
    }


    public MagicalChair createMagicalChair() {
        return new MagicalChair();
    }


    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}

