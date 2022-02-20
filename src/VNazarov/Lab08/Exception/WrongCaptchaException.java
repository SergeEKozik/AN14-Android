package VNazarov.Lab08.Exception;

public class WrongCaptchaException extends Exception{
    public WrongCaptchaException(){
        String detail = "Invalid captcha, try again.";
        System.out.println(detail);
    }
}
