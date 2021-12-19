package ru.mirea.lab.lab3.ex2ex3;

public class TestShape1  {
    public static void main(String[] args) {
        Shape1 s1 = new Circle1(5.5, "RED", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        // У класса Shape нет метода getRadius()
        //System.out.println(s1.getRadius());
        Circle1 c1 = (Circle1)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        // Нельзя создать экземпляр абстрактного класса
        //Shape s2 = new Shape();
        Shape1 s3 = new Rectangle1(1.0, 2.0, "RED", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        // У класса Shape не метода getLength()
        //System.out.println(s3.getLength());
        Rectangle1 r1 = (Rectangle1)s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        Shape1 s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        // У класса Shape нет метода getSide()
        //System.out.println(s4.getSide());
        Rectangle1 r2 = (Rectangle1)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        // У класса Rectangle тоже нет метода getSide()
        //System.out.println(r2.getSide());
        System.out.println(r2.getLength());
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}

