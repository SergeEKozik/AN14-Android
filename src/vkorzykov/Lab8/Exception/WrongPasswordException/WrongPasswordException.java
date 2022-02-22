package vkorzykov.Lab8.Exception.WrongPasswordException;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super();
    }

    public WrongPasswordException(String message) {
        System.out.println(message);
    }
}
