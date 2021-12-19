package ru.mirea.lab.lab10.ex1;

import java.util.Scanner;
public class Test {
    private static final Scanner IN = new Scanner(System.in);
    private static final ConcreteFactory FACTORY = new ConcreteFactory();

    public static void main(String[] args) {
        System.out.print("Введите вещественную часть: ");
        int real = IN.nextInt();

        System.out.print("Введите мнимую часть: ");
        int image = IN.nextInt();

        Complex ComplexNumber11 = FACTORY.createComplex();
        Complex ComplexNumber12 = FACTORY.createComplex(real, image);

        System.out.println("ComplexNumber11 = " + ComplexNumber11);
        System.out.println("ComplexNumber12 = " + ComplexNumber12);
    }
}