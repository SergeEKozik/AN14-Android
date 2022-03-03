package kdavydenko.Lesson11_12.TaskA1;

public class Run {
    public static void main(String[] args) {

        Library library = new Library();

        for (int i = 0; i < 10; i++) {
            new Client(i, library).start();
        }
    }
}
