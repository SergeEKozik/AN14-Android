package vadim.sazonenko.Lab8.Exception;

public class WrongCaptchaException extends Exception{

    public WrongCaptchaException(String info) {
        super(info);
    }
}
