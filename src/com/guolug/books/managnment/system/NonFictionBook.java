package com.guolug.books.managnment.system;

/**
 * 非小说类的书籍
 * */
public class NonFictionBook extends Book {
    private String topic;//书籍主题

    public NonFictionBook() {
    }

    public NonFictionBook(String topic) {
        this.topic = topic;
    }

    public NonFictionBook(String name, String author, float price, String ISBN, String topic) {
        super(name, author, price, ISBN);
        this.topic = topic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String toString() {
        return "书名: " + this.getName() +
                "\n作者: " + this.getAuthor() +
                "\n价格: " + this.getPrice() +
                "\nISBN: " + this.getISBN() +
                "\n题材: " + this.getTopic()+
                "\n借阅状态: "+this.isStatus();
    }
}
