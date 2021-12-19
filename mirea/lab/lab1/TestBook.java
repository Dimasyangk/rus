package ru.mirea.lab.lab1;

public class TestBook {
    public static void main(String[] args) {
        Book a1 = new Book("А.И.Куприн ,", "Олеся ,",1898);
        Book a2= new  Book ("А.С.Пушкин ,","Евгений Онегин ,",1830);
        Book a3 = new Book("М.А.Шолохов ,","Судьба человека ,",1956);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
