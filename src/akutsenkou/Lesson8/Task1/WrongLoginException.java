package akutsenkou.Lesson8.Task1;

public class WrongLoginException extends Throwable {

    public WrongLoginException() {

    }

    public WrongLoginException(String wrongLoginException) {
        super(wrongLoginException);
    }
}
