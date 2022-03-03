package kdavydenko.Lesson11_12.TaskA1;

public class Library {
    public Library() {
    }

    public void getBooks(int numberOfClient, int countBookInPlace, int countBookToGo) {
        synchronized (this) {
            System.out.println("Client " + numberOfClient);
            System.out.println("Book in place " + countBookInPlace);
            System.out.println("Book to go " + countBookToGo);
        }
    }

    public void returnBooks(int numberOfClient) {
        System.out.println("Client " + numberOfClient + " returned the books");
    }
}
