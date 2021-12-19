package ru.mirea.lab.lab2;

public class TestAuthor {
    public static void main(String[] args) {
        Author c1 = new Author("Андрий ,", "evrey100pybley@mail.ru ,", 'М');
        Author с2 = new Author("Бородач ,", "1vs1vixodi@gmail.com ,", 'М');
        Author с3 = new Author("Люба ,", "bledniy15@yandex.ru ,", 'Ж');
        System.out.println(c1);
        System.out.println(с2);
        System.out.println(с3);
    }
}