package VNazarov.Lab11.Library;

import java.util.HashMap;
import java.util.Map;

public class User extends Library {
    private final Library library;
    private Book book = super.book;
    private final Map<String, Boolean> booksInLibrary;
    private final long millisForReading = 5_000;
    private final String name;

    public User(Library library, String name){
        this.library = library;
        this.name = name;
        booksInLibrary = library.getBooksInLibrary();
    }

    public synchronized void getBook(Book book) {
        this.book = book;
            if (booksInLibrary.containsKey(book.getName())) {
                while (this.book.isBookOccupied) {
                    System.out.println(name + " can't take book " + "\"" + book.getName() + "\"" + " by author " + book.getAuthor() + ", because it's occupied now.");
                    try {
                        wait();
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    }
                }
                System.out.println("Book " + "\"" + book.getName() + "\"" + " is taken by " + name);
                this.book.isBookOccupied = true;
            } else System.out.println("This book isn't contains in this library.");
        }

    public void read(Book book) {
        new Thread(() -> {
            synchronized (this) {
                if (booksInLibrary.containsKey(book.getName())) {
                    System.out.println(name + " is reading book " + "\"" + book.getName() + "\"");
                    try {
                        Thread.sleep(millisForReading);
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    }
                    this.book.isBookOccupied = false;
                    notify();
                } else System.out.println("This book isn't contains in this library.");
            }
        }).start();
    }
}
