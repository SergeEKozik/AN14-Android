package ssazonenko.lab8;

import ssazonenko.lab8.excaption.WrongCaptchaException;
import ssazonenko.lab8.excaption.WrongLoginException;
import ssazonenko.lab8.excaption.WrongPasswordException;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Profile {
    static final int LENGTH = 20;
    private static String login;
    private static String password;
    private static String confirmPassword;


    public Profile(String login, String password, String confirmPassword) {
        Profile.login = login;
        Profile.password = password;
        Profile.confirmPassword = confirmPassword;
    }

    public static void input() {
        System.out.println("Введите логин");
        Scanner console = new Scanner(System.in);
        login = console.nextLine();
        System.out.println("Введите пароль");
        password = console.nextLine();
        System.out.println("Подтвердите пароль");
        confirmPassword = console.nextLine();
    }


    public static void Signin() {
        try {
            if (login.length() >= LENGTH || !Pattern.matches("^[a-zA-z0-9_]+$", login)) {
                throw new WrongLoginException();
            }
            if (password.length() >= LENGTH || !Pattern.matches("^[a-zA-z0-9_]+$", login)) {
                throw new WrongPasswordException();
            }
            if (!password.equals(confirmPassword)) {
                System.out.println("Пароли не совпадают");
            } else {
                System.out.println("Вы вошли");
            }
        } catch (WrongLoginException e) {
            System.out.println("Логин некорректный");
        } catch (WrongPasswordException e) {
            System.out.println("Пароль некорректный");
        }
    }

}

