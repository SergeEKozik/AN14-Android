package kdavydenko.Lesson8;

import kdavydenko.Lesson8.ExceptionClasses.WrongCaptchaException;
import kdavydenko.Lesson8.ExceptionClasses.WrongLoginException;
import kdavydenko.Lesson8.ExceptionClasses.WrongPasswordException;

import java.util.Objects;
import java.util.Scanner;


public class Authorization {

    public static final int COUNT_SYMBOLS_IN_LANGUAGE = 26;
    public static final int FIRST_ENGLISH_CODE_IN_THE_TABLE = 65;
    private String login = "";
    private String password = "";
    private String confirmPassword = "";
    private String captcha = "";
    private static final String REGEX = "^[a-zA-Z0-9_]{1,19}$";

    public Authorization() {

    }

    private void printOnInterface(String message) {
        System.out.println(message);
    }

    private String scannerFromInterface() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public void interfaceAuthorization() {
        do {
            printOnInterface("Введите логин ");
            this.login = checkLogin(scannerFromInterface());
        } while (Objects.equals(this.login, ""));

        do {
            printOnInterface("Введите пароль ");
            this.password = checkPassword(scannerFromInterface());
        } while (Objects.equals(this.password, ""));

        do {
            printOnInterface("Повторите пароль ");
            this.confirmPassword = checkConfirmPassword(this.password, scannerFromInterface());
        } while (Objects.equals(this.confirmPassword, ""));

        do {
            this.captcha = generateCaptcha();
            printOnInterface("Введите капчу " + this.captcha);
        } while (checkCaptcha(this.captcha, scannerFromInterface()));

        printOnInterface("Регистрация пройдена успешно");
    }

    private boolean checkCaptcha(String generateCaptcha, String captcha) {
        try {
            if (!generateCaptcha.equals(captcha))
                throw new WrongCaptchaException();
        } catch (WrongCaptchaException e) {
            printOnInterface("Введена неверная каптча");
            return true;
        }
        return false;
    }

    private String generateCaptcha() {
        StringBuilder captcha = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            captcha.append((char) ((int) (Math.random() * COUNT_SYMBOLS_IN_LANGUAGE + FIRST_ENGLISH_CODE_IN_THE_TABLE)));
        }
        return captcha.toString();
    }

    private String checkConfirmPassword(String password, String confirmPassword) {
        try {
            if (!password.equals(confirmPassword))
                throw new WrongPasswordException();
        } catch (WrongPasswordException e) {
            printOnInterface("Введен неверный пароль");
            return "";
        }
        return password;
    }

    private String checkPassword(String password) {
        try {
            if (!login.matches(REGEX))
                throw new WrongPasswordException();
        } catch (WrongPasswordException e) {
            printOnInterface("Введен неверный пароль");
            return "";
        }
        return password;
    }

    private String checkLogin(String login) {
        try {
            if (!login.matches(REGEX))
                throw new WrongLoginException();
        } catch (WrongLoginException e) {
            printOnInterface("Введен неверный логин");
            return "";
        }
        return login;
    }

    public static boolean authorization(String login, String password, String confirmPassword) {
        try {
            if (!login.matches(REGEX))
                throw new WrongLoginException();
            if (!password.matches(REGEX) || !password.equals(confirmPassword))
                throw new WrongPasswordException();
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
