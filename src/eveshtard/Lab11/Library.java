package eveshtard.Lab11;
//Написать клиент для работы библиотеки. В библиотеке доступны к чтению несколько книг.
// Некоторые из них можно выдавать на руки некоторые только в читальный зал.
// Посетители могут брать одновременно по несколько книг на руки и в читальный зал.

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Library implements Runnable {
    private Map<String, Boolean> booksShelve;
    private Set<String> orderBooks;

    long timeSleep = 5000;

    @Override
    public void run() {
        try {
            orderBooks(orderBooks);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void orderBooks(Set<String> orderedBooks) throws InterruptedException {
        booksAtHome(orderedBooks);
        booksInRead(orderedBooks);
    }

    private synchronized void booksAtHome(Set<String> orderedBooks) {
        System.out.println("Books at the shelve before giving home " + booksShelve.keySet());
        for (String element : orderedBooks) {
            Boolean forHome = booksShelve.get(element);
            if (forHome != null) {
                if (forHome) {
                    booksShelve.remove(element);
                }
            }
        }
        System.out.println("Books at the shelve after giving home " + booksShelve.keySet());
    }

    private void booksInRead(Set<String> orderedBooks) throws InterruptedException {
        Map<String, Boolean> blockedBooks = new HashMap<>();
        synchronized (this) {
            for (String element : orderedBooks) {
                Boolean forHome = booksShelve.get(element);
                if (forHome != null) {
                    if (!forHome) {
                        booksShelve.remove(element);
                        blockedBooks.put(element, forHome);
                    }
                }
            }
        }
        System.out.println("Books at the shelve while reading " + booksShelve.keySet());
        Thread.sleep(timeSleep);
        booksShelve.putAll(blockedBooks);
        System.out.println("Books are back on the bookshelf after return " + booksShelve.keySet());
    }

    public Library(Map<String, Boolean> booksShelve, Set<String> orderBooks) {
        this.booksShelve = booksShelve;
        this.orderBooks = orderBooks;
    }

    public Library(Map<String, Boolean> books) {
        this.booksShelve = books;
    }

    public Map<String, Boolean> getBooksShelve() {
        return booksShelve;
    }

    public void setBooksShelve(Map<String, Boolean> booksShelve) {
        this.booksShelve = booksShelve;
    }

    public Set<String> getOrderBooks() {
        return orderBooks;
    }

    public void setOrderBooks(Set<String> orderBooks) {
        this.orderBooks = orderBooks;
    }
}
