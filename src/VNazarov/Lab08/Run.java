package VNazarov.Lab08;
import VNazarov.Lab08.Authentication.InternetShop;
import VNazarov.Lab08.Exception.WrongCaptchaException;
import VNazarov.Lab08.Exception.WrongLoginException;
import VNazarov.Lab08.Exception.WrongPasswordException;
import VNazarov.Lab08.UserData.User;

public class Run {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException, WrongCaptchaException {
        User dave = new User("Dave");
//        User juan = new User("Juan");

        InternetShop internetShop = new InternetShop() {};
        internetShop.getStatus(dave);

        internetShop.logIn(dave);
        internetShop.getStatus(dave);
    }
}
