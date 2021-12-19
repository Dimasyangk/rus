package ru.mirea.lab.lab10.ex2;

import java.util.Scanner;

public class Client {

    public Chair chair;

    public void sit() throws Exception {
        var scan = new Scanner(System.in);
        var fact = new ChairFactory();

        System.out.println("Какой стул создать?");
        System.out.println(" 1) Викторианский стул");
        System.out.println(" 2) Магический стул");
        System.out.println(" 3) Функциональный стул");

        int k = scan.nextInt();

        System.out.println();

        switch (k) {
            case 1:
                System.out.print("Введите возраст стула: ");
                chair = fact.createVictorianChair(scan.nextInt());
                System.out.println(chair);
                break;

            case 2:
                chair = fact.createMagicalChair();
                ((MagicalChair) chair).doMagic();
                break;

            case 3:
                chair = fact.createFunctionalChair();
                ((FunctionalChair) chair).doFunction();
                break;
        }

    }
}
   
