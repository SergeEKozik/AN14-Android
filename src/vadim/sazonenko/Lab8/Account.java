package vadim.sazonenko.Lab8;

import vadim.sazonenko.Lab8.Exception.WrongCaptchaException;
import vadim.sazonenko.Lab8.Exception.WrongLoginException;
import vadim.sazonenko.Lab8.Exception.WrongPasswordException;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Account {
    static final int maxLength = 20;
    private static String login;
    private static String password;
    private static String confirmPassword;
    static int numberRandom = (int) (Math.random() * 10000);
    static int captcha;

    Account(String login, String password, String confirmPassword) {
        Account.login = login;
        Account.password = password;
        Account.confirmPassword = confirmPassword;
    }

    public static void Scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите логин: ");
        login = scanner.nextLine();
        Captcha();
        System.out.print("Введите пароль: ");
        password = scanner.nextLine();
        Captcha();
        System.out.print("Подтвердите пароль: ");
        confirmPassword = scanner.nextLine();
    }

    public static void SingIn() {
        try {
            if (login.length() >= maxLength || !Pattern.matches("^[a-zA-Z0-9_]+$", login)) {
                throw new WrongLoginException();
            }
            if (password.length() >= maxLength || !Pattern.matches("^[a-zA-Z0-9_]+$", password)) {
                throw new WrongPasswordException();
            }

            if (!password.equals(confirmPassword)) {
                System.out.println("Пароли не совпадают");
            } else {
                System.out.println("Вы вошли");
            }
        } catch (WrongLoginException e) {
            System.out.println("Некорректный логин");
        } catch (WrongPasswordException e) {
            System.out.println("Некорректный пароль");
        }
    }

    public static void Captcha() {
        System.out.print("Для подтверждения введите " + numberRandom + " : ");
        Scanner scanner = new Scanner(System.in);
        captcha = scanner.nextInt();
        if (captcha == numberRandom) {
            System.out.println("Символы совпадают");
        } else {

            try {
                throw new WrongCaptchaException("Попробуйте позже");
            } catch (WrongCaptchaException e) {
                System.out.println("Попробуйте ещё раз");
                Captcha();
            }
        }
    }
}
