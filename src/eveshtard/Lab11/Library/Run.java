package eveshtard.Lab11.Library;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Map<String, Boolean> books = new HashMap<>();
        books.put("Горе от ума", true);
        books.put("Война и мир", false);
        books.put("Нельга забыць", true);
        books.put("Математика", false);

        Set<String> orderedBooks = new HashSet<>();
        orderedBooks.add("Нельга забыць");
        orderedBooks.add("Математика");


        Library library = new Library(books, orderedBooks);
        Thread reader = new Thread(library);
        Thread reader2 = new Thread(library);

        reader.start();
        reader2.start();
    }
}
