package ru.mirea.lab.lab3.ex4ex5;

public class MovableCircle implements Movable{
    protected int radius;
    protected MovablePoint center;
    public MovableCircle (int x, int y, int xSpeed, int ySpeed,int radius){
        this.radius = radius;
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);
    }
    public String toString(){
        return "Круг ("+ center.x + ", " + center.y + ") с радиусом равным: " + radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
