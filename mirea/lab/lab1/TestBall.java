package ru.mirea.lab.lab1;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("белый ,", "футбольный ," , 70);
        Ball b2= new Ball ("оранжевый ,", "баскетбольный ,", 78);
        Ball b3 = new Ball("желто-синий ,","волейбольный ,",67);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
