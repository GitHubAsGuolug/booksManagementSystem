package com.guolug.books.managnment.system;

/*
 *  小说类
 * */
public class FictionBook extends Book {
    private String level;//受众群体

    public FictionBook() {
    }

    public FictionBook(String level) {
        this.level = level;
    }

    public FictionBook(String name, String author, float price, String ISBN, String level) {
        super(name, author, price, ISBN);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "书名: " + this.getName() +
                "\n作者: " + this.getAuthor() +
                "\n价格: " + this.getPrice() +
                "\nISBN: " + this.getISBN() +
                "\n受众人群: " + this.getLevel();
    }
}
