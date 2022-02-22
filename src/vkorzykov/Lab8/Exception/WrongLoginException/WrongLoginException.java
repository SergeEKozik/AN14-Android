package vkorzykov.Lab8.Exception.WrongLoginException;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String message) {
        System.out.println(message);
    }

}
