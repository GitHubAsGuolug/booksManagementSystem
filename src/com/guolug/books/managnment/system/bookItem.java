package com.guolug.books.managnment.system;

public class bookItem implements Lendable {

    @Override
    public boolean lend(String BookISBN, Book[] BookArray) {
        if (search(BookISBN, BookArray) != -1) {
            if (BookArray[search(BookISBN, BookArray)].isStatus()) {
                //表示书籍可以借阅
                BookArray[search(BookISBN, BookArray)].setStatus(false);
                System.out.println("借书成功!");
                return true;
            } else {
                //表示书籍不可借阅
                throw new InputException("您输入的ISBN号所对应的书籍不可借阅");
            }
        } else {
            throw new InputException("您输入的ISBN号没有对应的书籍");
        }
    }

    @Override
    public boolean giveBack(String BookISBN, Book[] BookArray) {
        if (search(BookISBN, BookArray) != -1) {
            if (BookArray[search(BookISBN, BookArray)].isStatus()) {
                //表示书籍可以借阅,输入的ISBN号错误
                throw new InputException("您输入的ISBN号所对应的书籍未被借阅,不需要归还!");

            } else {
                //表示数据可以归还
                BookArray[search(BookISBN, BookArray)].setStatus(true);
                System.out.println("还书成功!");
                return true;
            }
        } else {
            throw new InputException("您输入的ISBN号没有对应的书籍");

        }
    }

    /**
     * @param books
     */
    public void display(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] instanceof FictionBook) {
                System.out.println(((FictionBook) books[i]).toString());
                System.out.println("=================================");
            } else if (books[i] instanceof NonFictionBook) {
                System.out.println(((NonFictionBook) books[i]).toString());
                System.out.println("=================================");
            }
        }
    }


    /**
     * @param ISBN
     * @param BookArray
     * @return
     */
    public static int search(String ISBN, Book[] BookArray) {
        for (int i = 0; i < BookArray.length; i++) {
            if (BookArray[i].getISBN() == ISBN) {
                return i;
            }
        }
        return -1;
    }
}
