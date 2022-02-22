package vkorzykov.Lab8;


import vkorzykov.Lab8.Exception.WrongLoginException.WrongLoginException;
import vkorzykov.Lab8.Exception.WrongPasswordException.WrongPasswordException;

import java.util.Scanner;

public class Authentication {
    public static final String REGEX = "[\\w]{1,19}";
    private String login;
    private String password;
    private String confirmPassword;

    private String scannerString() {
        Scanner scannerString = new Scanner(System.in);
        return scannerString.nextLine();
    }

    public void authorise() {
        setInterLogin();
        setInterPassword();
        setInterConfirmPassword();
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


    @Override
    public String toString() {
        return "Authentication{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                '}';
    }
}




