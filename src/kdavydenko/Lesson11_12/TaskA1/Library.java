package kdavydenko.Lesson11_12.TaskA1;

public class Library {

    private int countBookInPlace;
    private int countBookToGo;

    public Library(int countBookInPlace, int countBookToGo) {
        this.countBookInPlace = countBookInPlace;
        this.countBookToGo = countBookToGo;
    }

    public void getBooks(int numberOfClient) {
        synchronized (this) {
            System.out.println("Client " + numberOfClient);
            System.out.println("Book in place " + this.countBookInPlace);
            System.out.println("Book to go " + this.countBookToGo);
        }
    }
}
