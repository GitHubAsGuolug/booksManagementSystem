package com.guolug.books.managnment.system;


public class Stock {
    private Book[] stock = new Book[10];
    public Stock() {
    }

    public Stock(Book[] stock) {
        this.stock = stock;
    }

    public Book[] getStock() {
        return stock;
    }

    public void setStock(Book[] stock) {
        this.stock = stock;
    }
    public void add(Book books){
        Book[] book = new Book[this.getStock().length +1];
        for (int i = 0; i < book.length-1; i++) {
            book[i] = this.getStock()[i];
        }
        book[book.length-1] = books;
        this.setStock(book);
    }
}
















