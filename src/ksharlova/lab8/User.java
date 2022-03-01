package ksharlova.lab8;

import ksharlova.lab8.Exeptions.WrongLoginException;
import ksharlova.lab8.Exeptions.WrongPasswordException;
import ksharlova.lab8.Exeptions.WrongVerificationExeption;

import java.util.Scanner;

public class User {
    private String login;
    private String password;
    private String confirmPassword;
    private static final String REGEX = "^[A-Za-z0-9_]{0,20}$";

    public User(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
      this.login = login;
      this.password = password;
      this.confirmPassword = confirmPassword;
      checkLogInInfo(login, password, confirmPassword);
    };

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    // A1

    public static void checkLogInInfo(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (!login.matches(REGEX)) {
            throw new WrongLoginException("Incorrect login");
        } else if (!password.matches(REGEX) || !confirmPassword.matches(REGEX) || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Incorrect password");
        }
    }

    // A2

    public void userLoginVerification() throws WrongVerificationExeption {
        Scanner scanner = new Scanner(System.in);

        if (getLogin() == scanner.nextLine()) {                     // я понимаю, что ошибка здесь, но не понимаю, как это исправить и правильно загуглить
            System.out.println("Login successful");
        } else {
            throw new WrongVerificationExeption("Incorrect login");
        }
    }

    public void userPasswordVerification() throws WrongVerificationExeption {
        Scanner scanner = new Scanner(System.in);

        if (getPassword() == scanner.nextLine()) {
            System.out.println("Login successful");
        } else {
            throw new WrongVerificationExeption("Incorrect password");
        }
    }
}
