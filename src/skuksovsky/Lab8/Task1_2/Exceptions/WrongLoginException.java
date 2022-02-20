package skuksovsky.Lab8.Task1_2.Exceptions;

public class WrongLoginException extends Exception{
    public WrongLoginException(String message) {
        super(message);
    }
}
