package ru.mirea.lab.lab1;

public class Book {
    private String author;
    private String name;
    private int year;
    public Book (String author, String name,int year){
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String toString(){
        return "Автор: "+ this.author+ "название книги: "+this.name+ "год выпуска: "+ this.year;
    }
}
