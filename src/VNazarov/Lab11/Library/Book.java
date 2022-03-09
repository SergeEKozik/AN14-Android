package VNazarov.Lab11.Library;

public class Book {
    protected boolean isBookOccupied;
    private final String name;
    private final String author;

    protected Book (String name, String author){
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}
