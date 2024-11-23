package com.guolug.books.managnment.system;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        bookItem bookItem = new bookItem();
        Book[] books = new Book[]{


//                new FictionBook("西游记", "吴承恩", 250.00F, "345678901", "神话"),
//                new FictionBook("红楼梦", "曹雪芹", 350.50F, "456789012", "古典文学"),
                new FictionBook("三国演义", "罗贯中", 300.12F, "123456", "历史"),
                new FictionBook("水浒传", "施耐庵", 280.00F, "123457", "历史"),
                new FictionBook("白鹿原", "陈忠实", 220.00F, "123458", "现代文学"),
                new FictionBook("活着", "余华", 180.00F, "123459", "当代文学"),
                new FictionBook("平凡的世界", "路遥", 200.00F, "123460", "当代文学"),
                new FictionBook("边城", "沈从文", 150.00F, "123461", "古典文学"),
                new FictionBook("围城", "钱钟书", 210.00F, "123462", "现代文学"),
                new FictionBook("茶馆", "老舍", 190.00F, "123463", "戏剧"),
                new NonFictionBook("人类简史", "尤瓦尔·赫拉利", 280.00F, "123464", "历史"),
                new NonFictionBook("宇宙简史", "斯蒂芬·霍金", 200.00F, "123465", "科普"),
        };
        Stock stock = new Stock(books);
        boolean flag = true;
        while (flag) {
            System.out.println("=================================");
            System.out.println("[1]查看可借的书-待开发");
            System.out.println("[2]借书");
            System.out.println("[3]还书");
            System.out.println("[4]查看所有书籍");
            System.out.println("[5]添加书籍");
            System.out.println("[0]退出系统");
            System.out.println("请输入你要进行的操作:");
            switch (scanner.nextInt()) {
                case 1:

                case 2:
                    System.out.print("请输入你要借的书的ISBN号:");
                    bookItem.lend(scanner.next(), books);
                    break;
                case 3:
                    System.out.print("请输入你要还的书的ISBN号:");
                    bookItem.giveBack(scanner.next(), books);
                    break;
                case 4:
                    bookItem.display(stock.getStock());
                    break;
                case 5:
                    System.out.println("要添加的书籍是小说类还是非小说类(y/n):");
                    if ("y".equals(scanner.next())) {
                        System.out.println("依次输入名称,作者,价格,ISBN,level:");
                        stock.add((Book)new FictionBook(scanner.next(), scanner.next(), scanner.nextFloat(), scanner.next(), scanner.next()));
                    } else if ("n".equals(scanner.next())) {
                        System.out.println("依次输入名称,作者,价格,ISBN,topic:");
                        stock.add((Book)new FictionBook(scanner.next(), scanner.next(), scanner.nextFloat(), scanner.next(), scanner.next()));
                    }
                    break;
                case 0:
                    flag = false;
                    break;
            }
        }
    }
}
