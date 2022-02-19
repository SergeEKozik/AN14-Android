package akalevich.Lesson_8.Task_A1;

import akalevich.Lesson_8.Task_A1.Exceptions.WrongLoginException;
import akalevich.Lesson_8.Task_A1.Exceptions.WrongPasswordConfirmException;
import akalevich.Lesson_8.Task_A1.Exceptions.WrongPasswordException;
import akalevich.Lesson_8.Task_A1.Utils.IScanner;

import java.util.regex.Pattern;

public class MainApp implements IScanner {

    private static final int MAX_LOGIN_LENGTH = 20;
    private static final int MAX_PASSWORD_LENGTH = 20;

    public static void main(String[] args) {
        AccountVerify();
    }

    public static void AccountVerify() {
        try {
            loginCheck();
            passwordCheck();
        }
         catch (WrongLoginException exception) { System.out.println("Incorrect Login"); }
         catch (WrongPasswordException exception) { System.out.println("Incorrect Password"); }
         catch (WrongPasswordConfirmException exception) { System.out.println("Wrong Password Confirm"); }
    }

    public static void loginCheck() throws WrongLoginException{
        System.out.print("Login: ");
        String login = scan.nextLine();
        if (login.length() >= MAX_LOGIN_LENGTH || !Pattern.matches("^[a-zA-Z0-9_]+$", login)) throw new WrongLoginException();
    }

    public static void passwordCheck() throws WrongPasswordException, WrongPasswordConfirmException {
        System.out.print("Password: ");
        String password = scan.nextLine();
        if (password.length() >= MAX_PASSWORD_LENGTH || !Pattern.matches("^[a-zA-Z0-9_]+$", password)) throw new WrongPasswordException();
        passwordConfirmCheck(password);
    }

    public static void passwordConfirmCheck(String password) throws WrongPasswordConfirmException {
        System.out.print("Confirm Password: ");
        if (!password.equals(scan.nextLine())) throw new WrongPasswordConfirmException();
    }
}
