package com.guolug.books.managnment.system;

//抽象类
abstract public class Book {
    private String name;
    private String author;
    private float price;
    private String ISBN;
    private boolean status;
    public Book() {
    }

    public Book(String name, String author, float price, String ISBN) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.ISBN = ISBN;
        this.status = true;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
