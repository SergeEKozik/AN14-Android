package achapovskiy.lab8;

import java.util.regex.Pattern;

public class Verify extends Registration {
    private static String pass;

    public static void verLog(String login) throws WrongLoginException {
        boolean TrueOrFalse = Pattern.matches("^[A-Za-z0-9_]+$", login);
            if (login.length() >= maxLogLenght || !TrueOrFalse) {
                throw new WrongLoginException("Логин не удовлетворяет требованиям!");
            }
    }

    public static void verPas(String password) throws WrongPasswordException {
        boolean TrueOrFalse = Pattern.matches("^[A-Za-z0-9_]+$", password);
        try {
            if (password.length() >= maxPasLenght || !TrueOrFalse) {
                throw new WrongPasswordException();
            } else {
                pass = password;
            }
        } catch (WrongPasswordException exception) {
            System.out.println("Пароль не удовлетворяет требованиям!");
            Verify.verPas(Registration.password());
        }
    }

    public static void verPasConf(String confirmPassword) throws WrongPasswordException {
        try {
            if (!confirmPassword.equals(pass)) {
                throw new WrongPasswordException();
            }
        } catch (WrongPasswordException exception) {
            System.out.println("Пароли не совпадают!");
            Verify.verPasConf(Registration.confirmPassword());
        }
    }
}

