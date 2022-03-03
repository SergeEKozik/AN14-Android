package akalevich.Lesson_11.Task_1;

import java.util.*;

public class MainApp {

    public static final int DESIRE_BOOKS_COUNT = 2;

    public static void main(String[] args) {
        List<String> books = new ArrayList<>();
        books.add("Warcraft. Chronics. Tome 1");
        books.add("Warcraft. Chronics. Tome 2");
        books.add("Warcraft. Chronics. Tome 3");
        books.add("Warcraft. Illidan");
        books.add("Warcraft. Lich King");
        books.add("Warcraft. Doomhammer");

        Library library = new Library(books);

        LibraryClient user1 = new LibraryClient("User1", getRandomBookDesire(books), library);
        LibraryClient user2 = new LibraryClient("User2", getRandomBookDesire(books), library);

        Thread client1 = new Thread(user1);
        Thread client2 = new Thread(user2);

        client1.start();
        client2.start();
    }

    public static Map<String, Boolean> getRandomBookDesire(List<String> books) {
        Map<String, Boolean> result = new HashMap<>();
        for (int index = 0; index < DESIRE_BOOKS_COUNT; index++)
        result.put(books.get((int) (Math.random() * books.size())), new Random().nextBoolean());
        return result;
    }
}
