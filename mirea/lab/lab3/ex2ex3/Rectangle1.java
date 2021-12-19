package ru.mirea.lab.lab3.ex2ex3;

public class Rectangle1  extends  Shape1 {
    protected double width;
    protected double length;
    public Rectangle1() {}
    public Rectangle1(double width,double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle1(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return 2* (width + length);
    }
    public String toString() {
        return "Прямоуголник с шириной=" + width + ", длиной=" + length + ", площадь которого равна=" + getArea() + ", периметр=" + getPerimeter();
    }
}
