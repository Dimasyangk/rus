package ru.mirea.lab.lab12_13_14_15.ex3;

public class Shirts {
        private String article, Name, color, size;

        public Shirts(String stringToParse){
            String[] s = stringToParse.split(",");
            article = s[0];
            Name = s[1];
            color = s[2];
            size = s[3];
        }

        @Override
        public String toString() {
            return "Shirt:\n" + "\tarticle='" + article + '\'' + "\n\tName='" + Name + '\'' + "\n\tcolor='" + color + '\'' + "\n\tsize='" + size + '\'';
        }

        public static void main(String[] args) {
            String[] strs = new String[]{
                    "S001,Black Polo Shirt,Black,XL",
                    "S002,Black Polo Shirt,Black,L",
                    "S003,Blue Polo Shirt,Blue,XL",
                    "S004,Blue Polo Shirt,Blue,M",
                    "S005,Tan Polo Shirt,Tan,XL",
                    "S006,Black T-Shirt,Black,XL",
                    "S007,White T-Shirt,White,XL",
                    "S008,White T-Shirt,White,L",
                    "S009,Green T-Shirt,Green,S",
                    "S010,Orange T-Shirt,Orange,S",
                    "S011,Maroon Polo Shirt,Maroon,S"
            };
            Shirts[] shirts = new Shirts[strs.length];
            for (int i = 0; i < strs.length; i++) {
                shirts[i] = new Shirts(strs[i]);
                System.out.println(shirts[i]);
            }
        }
}

