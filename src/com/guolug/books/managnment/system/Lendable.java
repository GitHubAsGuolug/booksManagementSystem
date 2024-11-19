package com.guolug.books.managnment.system;

public interface Lendable {
    /**
     * 借书方法
     * @param BookISBN 被还的书的对象的ISBN号
     * @return 方式true表示借书成功
     */
    boolean lend(String BookISBN,Book[] BookArray);

    /**
     * 还书方法
     * @param BookISBN 被还的书的对象的ISBN号
     * @return 返回true表示还书成功
     */
    boolean giveBack(String BookISBN,Book[] BookArray);
}
