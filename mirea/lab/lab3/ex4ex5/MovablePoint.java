package ru.mirea.lab.lab3.ex4ex5;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    public MovablePoint(int x,int y,int xSpeed,int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public String toString(){
        return  "Точка (" + x + ", " + y +")";
    }
    public void  moveUp(){y++;}
    public void  moveDown(){y--;}
    public void  moveLeft(){x++;}
    public void  moveRight(){x--;}
    }

