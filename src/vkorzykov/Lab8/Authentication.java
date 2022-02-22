package vkorzykov.Lab8;


import vkorzykov.Lab8.Exception.WrongCaptchaException.WrongCaptchaException;
import vkorzykov.Lab8.Exception.WrongLoginException.WrongLoginException;
import vkorzykov.Lab8.Exception.WrongPasswordException.WrongPasswordException;

import java.util.Random;
import java.util.Scanner;

public class Authentication {
    public static final String REGEX = "[\\w]{1,19}";
    private static final int AMOUNT_OF_NUMBERS = 10;
    private String login;
    private String password;
    private String confirmPassword;
    private String captcha;
    private String confirmCaptcha;

    private String scannerString() {
        Scanner scannerString = new Scanner(System.in);
        return scannerString.nextLine();
    }

    public void authorise() {
        setInterLogin();
        setInterPassword();
        setInterConfirmPassword();
        interCaptcha();
        System.out.println("Логин: " + login + " Пароль: " + password);
    }

    private void setInterLogin() {
        login = "";
        do {
            System.out.println("Введите Логин");
            String login = scannerString();
            if (login.matches(REGEX)) {
                this.login = login;
            } else {
                try {
                    throw new WrongLoginException();
                } catch (WrongLoginException e) {
                    System.out.println("Введён неправильный Логин");
                }
            }
        } while (!login.matches(REGEX));
    }

    private void setInterPassword() {
        password = "";
        do {
            System.out.println("Введите Пароль");
            String password = scannerString();
            if (password.matches(REGEX)) {
                this.password = password;
            } else {
                try {
                    throw new WrongPasswordException();
                } catch (WrongPasswordException e) {
                    System.out.println("Введён неправильный Пароль");
                }
            }
        } while (!password.matches(REGEX));
    }

    private void setInterConfirmPassword() {
        confirmPassword = "";
        do {
            System.out.println("Подтвердите пароль");
            String confirmPassword = scannerString();
            if (confirmPassword.equals(this.password)) {
                this.confirmPassword = confirmPassword;
            } else {
                try {
                    throw new WrongPasswordException();
                } catch (WrongPasswordException e) {
                    System.out.println("Введён неправильный подтвреждающий пароль");
                }
            }
        } while (!password.equals(this.confirmPassword));
    }

    private String randomCaptcha() {
        Random random = new Random();
        int upperbound = AMOUNT_OF_NUMBERS;
        int[] captcha = new int[random.nextInt(upperbound)];
        StringBuilder captchaName = new StringBuilder();
        for (int i = 0; i < captcha.length; i++) {
            captcha[i] = random.nextInt(upperbound);
            captchaName.append(captcha[i]);
        }
        return captchaName.toString();
    }

    private void interCaptcha() {
        this.captcha = "";
        do {
            System.out.println("Введите капчу");
            this.captcha = randomCaptcha();
            System.out.println(captcha);
            this.confirmCaptcha = scannerString();
            if (this.captcha.equals(confirmCaptcha)) {
                System.out.println("Вы авторизавались");
            } else {
                try {
                    throw new WrongCaptchaException();
                } catch (WrongCaptchaException e) {
                    System.out.println("Введена неправильная капча");
                }
            }
        } while (!captcha.equals(confirmCaptcha));
    }




    @Override
    public String toString() {
        return "Authentication{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'';
    }
}




