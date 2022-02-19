package kdavydenko.Lesson8.ExceptionClasses;

public class WrongCaptchaException extends Exception{
    public WrongCaptchaException() {
        super();
    }

    public WrongCaptchaException(String message) {
        super(message);
    }
}
