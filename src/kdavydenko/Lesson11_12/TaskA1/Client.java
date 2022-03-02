package kdavydenko.Lesson11_12.TaskA1;

public class Client extends Thread {

    private int numberOfClient;
    private Library library;

    public Client(int numberOfClient, Library library) {
        this.numberOfClient = numberOfClient;
        this.library = library;
    }

    @Override
    public void run() {
        this.library.getBooks(this.numberOfClient);
    }
}
