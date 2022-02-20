package kdavydenko.Lesson8.ExceptionClasses;

public class WrongLoginException extends Exception {

    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String message) {
        super(message);
    }

}
