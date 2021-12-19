package ru.mirea.lab.lab2;

public class Baall {
    private double x = 0.0;
    private double y = 0.0;

    public Baall () {}
    public Baall (double x,double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY (double x, double y){
        this.x = x;
        this.y = y;
    }
    public  void move (double xDisp, double yDisp){
        x+= xDisp;
        y+= yDisp;
    }
    @Override
    public String toString() {
        return "Ball ("+this.x+", "+this.y+").";
    }
}
