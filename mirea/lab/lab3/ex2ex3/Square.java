package ru.mirea.lab.lab3.ex2ex3;

public class Square extends Rectangle1{
    public Square (){};
    public Square (double side){
        super(side,side);
    }
    public Square(double side,String color,boolean filled) {
        super(side,side,color,filled);
    }
    public double getSide() {
        return width;
    }
    public void setSide(double side){
        width = side;
        length = side;
    }
    public void getWidth(double side){
        setSide(side);
        setSide(side);
    }
    public String toString(){
        return "Квадрат с стороной=" + getSide() + ", площадью=" + getArea() + ", периметром=" + getPerimeter();
    }
}
