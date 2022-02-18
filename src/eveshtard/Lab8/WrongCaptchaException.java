package eveshtard.Lab8;

public class WrongCaptchaException extends Exception {
    public WrongCaptchaException() {
        super();
    }

    public WrongCaptchaException(String message) {
        super(message);
    }
}
