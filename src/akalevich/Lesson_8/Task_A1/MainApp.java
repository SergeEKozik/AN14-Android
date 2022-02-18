package akalevich.Lesson_8.Task_A1;

import akalevich.Lesson_8.Task_A1.Exceptions.WrongLoginException;
import akalevich.Lesson_8.Task_A1.Exceptions.WrongPasswordConfirmException;
import akalevich.Lesson_8.Task_A1.Exceptions.WrongPasswordException;

import java.util.regex.Pattern;

public class MainApp implements IScanner {

    private static final int MAX_LOGIN_LENGTH = 20;
    private static final int MAX_PASSWORD_LENGTH = 20;

    public static void main(String[] args) {
        AccountVerify(login(), password(), passwordConfirm());
    }

    public static String login() {
        System.out.println("Login: ");
        return scan.nextLine();
    }

    public static String password() {
        System.out.println("Password: ");
        return scan.nextLine();
    }

    public static String passwordConfirm() {
        System.out.println("Confirm Password: ");
        return scan.nextLine();
    }

    public static void AccountVerify(String login, String password, String passwordConfirm) {
        try {
            if (login.length() >= MAX_LOGIN_LENGTH || !Pattern.matches("^[a-zA-Z0-9_]+$", login))
                throw new WrongLoginException();
            if (password.length() >= MAX_PASSWORD_LENGTH || !
                    Pattern.matches("^[a-zA-Z0-9_]+$", password))
                throw new WrongPasswordException();
            if (!password.equals(passwordConfirm)) throw new WrongPasswordConfirmException();
        }
         catch (WrongLoginException exception) { System.out.println("Incorrect Login"); }
         catch (WrongPasswordException exception) { System.out.println("Incorrect Password"); }
         catch (WrongPasswordConfirmException exception) { System.out.println("Wrong Password Confirm"); }
    }
}
