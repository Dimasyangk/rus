package ru.mirea.lab.lab3.ex2ex3;

    public abstract class Shape1 {
        protected String color;
        protected boolean filled;
        public Shape1(String color,boolean filled){
            this.color=color;
            this.filled=filled;
        }

        public String getColor() {
            return color;
        }
        public Shape1 () {this("RED", true);}

        public void setColor(String color) {
            this.color = color;
        }
        public boolean isFilled(){
            return filled;
        }
        public void setFilled (boolean filled) {
            this.filled = filled;
        }
        abstract public double getArea();
        abstract public double getPerimeter();
        abstract public String toString();
    }
