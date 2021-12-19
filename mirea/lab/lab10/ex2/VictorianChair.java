package ru.mirea.lab.lab10.ex2;

public class VictorianChair implements Chair {
    private final int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return (
                "VictorianChair {\n"
                        + "  age: " + this.age + "\n"
                        + "}"
        );
    }
}
