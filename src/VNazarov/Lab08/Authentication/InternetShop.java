package VNazarov.Lab08.Authentication;

import VNazarov.Lab08.Exception.WrongCaptchaException;
import VNazarov.Lab08.Exception.WrongLoginException;
import VNazarov.Lab08.Exception.WrongPasswordException;
import VNazarov.Lab08.UserData.User;

import java.util.Random;
import java.util.Scanner;

public abstract class InternetShop extends User {
    private boolean isLogIn;
    private String status = "logged out";

    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void logIn(User user) throws WrongLoginException, WrongPasswordException, WrongCaptchaException {
        if (!isLogIn){
            System.out.println("Sign in:");
            try{
                loginException(user);
                passwordException(user);
                captchaException(user);
                System.out.println("Successfully logged in.\n");
                isLogIn = true;
                boolToStr();
            }catch (WrongLoginException | WrongPasswordException | WrongCaptchaException ignored){}
        } else System.out.println("Already " + status);
    }

    private void boolToStr(){
        if (isLogIn) status = "logged in";
    }
    public void getStatus(User user) {
        System.out.println("User" + user.getName() + " is " + status);
    }

    private void loginException(User user) throws WrongLoginException{
        System.out.print("Login: ");
        String login = sc.nextLine();
        if (!login.equals(user.getLogin())){
            throw new WrongLoginException();
        }
    }
    private void passwordException(User user) throws WrongPasswordException{
        System.out.print("Password: ");
        String password = sc.nextLine();
        if (!password.equals(user.getPassword())){
            throw new WrongPasswordException();
        }
    }
    private void captchaException(User user) throws WrongCaptchaException {
        int captcha = rd.nextInt(8999) + 1000;
        System.out.print("Captcha is " + captcha + ". Enter the number: ");
        int captchaCheck = sc.nextInt();
        if (captchaCheck != captcha){
            throw new WrongCaptchaException();
        }
    }
}
