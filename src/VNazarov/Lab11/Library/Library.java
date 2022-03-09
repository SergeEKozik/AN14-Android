package VNazarov.Lab11.Library;

import java.util.*;

public class Library{
    private final Map<String, Boolean> booksInLibrary = new HashMap<>();
    protected Book book;

    Random rd = new Random();

    public Library(List<Book> listOfBooks){
        for (Book book: listOfBooks) {
            booksInLibrary.put(book.getName(), rd.nextBoolean());
        }
    }

    public Library() {

    }

    public void display(){
        System.out.println(booksInLibrary);
    }

    protected Map<String, Boolean> getBooksInLibrary() {
        return booksInLibrary;
    }
}
