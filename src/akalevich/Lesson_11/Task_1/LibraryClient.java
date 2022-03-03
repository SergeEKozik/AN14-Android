package akalevich.Lesson_11.Task_1;

import java.util.HashMap;
import java.util.Map;

public class LibraryClient implements Runnable {

    private final Library library;
    private final Map<String, Boolean> desiredBooks = new HashMap<>();
    private final String name;

    public void run() {
        System.out.println(name + " has visited library.");
        if (wrongDesire()) {
            System.out.println(name + " can't find desire books.");
            return;
        }
        try {
            while (library.isBooksInStock(desiredBooks)) {
                wait();
            }
            takeBook();
            readBooks();
            returnBook();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        System.out.println("true");
    }

    private void takeBook() {
        System.out.println(name + " took some books from library");
        library.giveBook(desiredBooks);
    }

    private void returnBook() {
        System.out.println(name + " took return books from library");
        library.takeBackBooks(desiredBooks);
        notify();
    }

    private void readBooks() throws InterruptedException {
        for (Map.Entry<String, Boolean> book : desiredBooks.entrySet()) {
            if (book.getValue()) Thread.sleep(Library.TIME_TO_READ_AT_LIBRARY);
            else Thread.sleep(Library.TIME_TO_READ_AT_HOME);
        }
    }

    private boolean wrongDesire() {
        return true; // проверка совпадает ля хотелка с наличкой
    }

    public LibraryClient (String name, Map<String, Boolean> desiredBooks, Library library) {
        this.library = library;
        this.name = name;
        this.desiredBooks.putAll(desiredBooks);
        showClientDesire();
    }

    private void showClientDesire() {
        System.out.println("Client name: " + name);
        for (Map.Entry<String, Boolean> book : desiredBooks.entrySet()) {
            if (book.getValue()) {
                System.out.println("Desired Book: " + book.getKey() + " - at Home");
            } else {
                System.out.println("Desired Book: " + book.getKey() + " - at Library");
            }
        }
        System.out.println();
    }
}
