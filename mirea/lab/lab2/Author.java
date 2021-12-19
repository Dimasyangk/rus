package ru.mirea.lab.lab2;

public class Author {
    private String name,email;
    private char gender;
    public Author(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }
    public String toString(){
        return "Имя: "+this.name+"почтовый адрес: "+this.email+"пол: "+this.gender;
    }
}
