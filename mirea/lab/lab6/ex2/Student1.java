package ru.mirea.lab.lab6.ex2;

import java.util.Arrays;
public class Student1 {
    private String name;
    private int GPA;

    public Student1(String name, int GPA) {
        this.name=name;
        this.GPA=GPA;
    }

    public Student1() {

    }

    public String getName() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }
}