package com.pb.titova.hw5;

public class Book {
    private String name;
    private String author;
    private String yearpub;

    public Book(String name, String author, String yearpub) {
        this.name = name;
        this.author = author;
        this.yearpub = yearpub;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYearpub() {
        return yearpub;
    }

    public void setYearpub(String yearpub) {
        this.yearpub = yearpub;
    }

    public String getInfo(){
        return ""+ name +" (" + author + "" + yearpub+")";
    }
}
