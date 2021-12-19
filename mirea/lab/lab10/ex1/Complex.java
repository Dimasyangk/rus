package ru.mirea.lab.lab10.ex1;

public class Complex {
    private int re;           // вещественная часть
    private int im;           // мнимая часть

    public Complex(int re, int im) {
        this.re = re;
        this.im = im;
    }

    public int getRe() {
        return this.re;
    }

    public int getIm() {
        return this.im;
    }

    public void setRe(int re) {
        this.re = re;
    }

    public void setIm(int im) {
        this.im = im;
    }

    @Override
    public String toString() {
        return this.re + " + " + this.im + "i";
    }
}