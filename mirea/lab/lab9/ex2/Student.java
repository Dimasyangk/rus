package ru.mirea.lab.lab9.ex2;


public class Student {
    private int iD;
    private double GPA;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int iD, int GPA, String name) {
        this.iD = iD;
        this.GPA=GPA;
        this.name = name;

    }

    public Student(int iD, int GPA) {
        this.iD = iD;
        this.GPA = GPA;
    }

    public Student() {

    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }


    @Override
    public String toString() {
        return "Student{" +
                "iD=" + iD +
                ", GPA=" + GPA +
                ", name='" + name + '\'' +
                '}';
    }
}

