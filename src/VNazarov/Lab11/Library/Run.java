package VNazarov.Lab11.Library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Run {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        Book book1 = new Book("The Witcher", "Andjey Sapkowski");
        Book book2 = new Book("Fathers and Sons", "Fedor Dostoevskiy");
        Book book3 = new Book("Tikhiy Don", "Dmitriy Sholokhov");

        books.add(book1);
        books.add(book2);
        books.add(book3);

        Library library = new Library(books);

        User dave = new User(library, "Dave");
        User hanna = new User(library, "Hanna");

        dave.getBook(book1);
        dave.read(book1);
        hanna.getBook(book2);
        hanna.getBook(book1);
//        library.read();

//        library.display();
    }
}
