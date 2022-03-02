package kdavydenko.Lesson11_12.TaskA1;

public class Run {
    public static final int RANGE_RANDOM = 10;

    public static void main(String[] args) {

        Library library = new Library((int) (Math.random() * RANGE_RANDOM), (int) (Math.random() * RANGE_RANDOM));

        for (int i = 0; i < 100; i++) {
            new Client(i, library).start();
        }
    }
}
