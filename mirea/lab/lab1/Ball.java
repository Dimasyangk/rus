package ru.mirea.lab.lab1;

public class Ball {
        private String collor;
        private String type;
        private int radius;
        public Ball (String collor, String type,int radius){
            this.collor = collor;
            this.type = type;
            this.radius = radius;
        }

        public String getCollor() {
            return collor;
        }

        public void setCollor(String collor) {
            this.collor = collor;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }
        public String toString(){
            return "Цвет мяча: "+ this.collor+ "вид мяча: "+this.type+ "радиус(в см) : "+ this.radius;
        }
    }
