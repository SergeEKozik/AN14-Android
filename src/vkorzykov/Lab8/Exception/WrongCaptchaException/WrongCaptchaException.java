package vkorzykov.Lab8.Exception.WrongCaptchaException;

public class WrongCaptchaException extends Exception {
    public WrongCaptchaException() {
        super();
    }
    public WrongCaptchaException(String message){
        System.out.println(message);
    }
}
