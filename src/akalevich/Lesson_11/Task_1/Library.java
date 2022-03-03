package akalevich.Lesson_11.Task_1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    public static final int TIME_TO_READ_AT_LIBRARY = 3000;
    public static final int TIME_TO_READ_AT_HOME = 5000;

    private final Map<String, Boolean> booksInStock = new HashMap<>();

    public Library(List<String> books) {
        boolean isBookCanReadAtLibrary = true;
        for (int index = 0; index < Math.random()*books.size(); index ++) {
            this.booksInStock.put(books.get(index), isBookCanReadAtLibrary);
        }
        for (String index : books) {
            if (!this.booksInStock.containsKey(index)) this.booksInStock.put(index, !isBookCanReadAtLibrary);
        }
        showBooks();
    }

    private void showBooks() {
        for (Map.Entry<String, Boolean> book : booksInStock.entrySet()) {
            if (book.getValue()) {
                System.out.println("Book: " + book.getKey() + "\nCan be used only at library\n");
            } else {
                System.out.println("Book: " + book.getKey() + "\nCan be used at library & at home\n");
            }
        }
    }

    public boolean isBooksInStock(Map<String, Boolean> desireBooks) {
        boolean result = false;
        for (Map.Entry<String, Boolean> book : booksInStock.entrySet()) {
            result = booksInStock.containsKey(book.getKey());
        }
        return result;
    }

    private void showBookLibrary() {
        for (Map.Entry<String, Boolean> book : booksInStock.entrySet()) {
                System.out.println("Book: " + book.getKey() + " in Library Stock right now\n");
        }
    }

    public void giveBook(Map<String, Boolean> desiredBooks) {
        for (Map.Entry<String, Boolean> book : desiredBooks.entrySet()) {
            booksInStock.remove(book.getKey());
        }
        showBookLibrary();
    }

    public void takeBackBooks(Map<String, Boolean> desiredBooks) {
        booksInStock.putAll(desiredBooks);
        showBookLibrary();
    }
}
