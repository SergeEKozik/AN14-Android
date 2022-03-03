package kdavydenko.Lesson11_12.TaskA1;

public class Client extends Thread {
    public static final int RANGE_RANDOM = 10;
    public static final int TIME_TO_SLEEP = 1000;
    private int numberOfClient;
    private Library library;

    public Client(int numberOfClient, Library library) {
        this.numberOfClient = numberOfClient;
        this.library = library;
    }

    @Override
    public void run() {
        try {
            Thread.sleep((int) (Math.random() * TIME_TO_SLEEP));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.library.getBooks(this.numberOfClient, (int) (Math.random() * RANGE_RANDOM), (int) (Math.random() * RANGE_RANDOM));
        try {
            Thread.sleep((int) (Math.random() * TIME_TO_SLEEP));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.library.returnBooks(this.numberOfClient);
    }
}
