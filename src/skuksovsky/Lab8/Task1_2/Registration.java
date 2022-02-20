package skuksovsky.Lab8.Task1_2;

import skuksovsky.Lab8.Task1_2.Exceptions.*;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Registration {
    final private String PATTERN = "\\w{1,20}";
    final private int CAPTCHA_LENGTH = 5;
    private String login;
    private String password;
    private String confirm_password;
    private HashMap users_data = new HashMap();
    final private Scanner SC = new Scanner(System.in);

    private String generate_captcha() {
        byte[] array = new byte[CAPTCHA_LENGTH];
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("UTF-8"));
        return generatedString;
    }

    private void captcha_entering() {
        String captcha = generate_captcha();
        while (true) {
            System.out.println("Докажите, что вы не бот, ввведите капчу: " + captcha);
            String user_input = SC.nextLine();
            if (captcha.equals(user_input)) {
                break;
            } else {
                continue;
            }
        }
    }

    private void credentials_entering() {
        while (true) {
            try {
                System.out.println("Введите login нового пользователя: ");
                login = SC.nextLine();
                if (!login.matches(PATTERN) | login.equals("EXIT")) throw new WrongLoginException("Wrong Login");
                System.out.println("Введите password нового пользователя: ");
                password = SC.nextLine();
                if (!password.matches(PATTERN)) throw new WrongPasswordException("Wrong Password");
                System.out.println("Подтвердите password: ");
                confirm_password = SC.nextLine();
                if (!password.equals(confirm_password)) throw new IncorrectPassConfirmationException("Password wasn't confirmed");
                break;
            } catch (WrongLoginException e) {
                System.out.println("Логин не соответствует правилам");
                continue;
            } catch (WrongPasswordException e) {
                System.out.println("Пароль не соответствует правилам");
            } catch (IncorrectPassConfirmationException e) {
                System.out.println("Введенные пароли не совпадают.");
            }
        }
    }

    void registration() {
        while (true) {
            System.out.println("Регистрация");
            credentials_entering();
            try {
                if (!users_data.containsKey(login)) {
                    users_data.put(login, password);
                    System.out.println("Регистрация прошла успешно!");
                    break;
                } else {
                    throw new AlreadyExistsException("Такой пользователь уже существует!");
                }
            } catch (AlreadyExistsException e) {
                System.out.println("Такой пользователь уже зарегистрирован! Измените данные.");
                continue;
            }
        }
    }

    void authentication() {
        System.out.println("Авторизация");
        while (true) {
            System.out.println("Введите логин (EXIT для выхода): ");
            String login = SC.nextLine();
            if (login.equals("EXIT")) break;
            System.out.println("Введите пароль: ");
            String password = SC.nextLine();

            try {
                if (users_data.containsKey(login) & users_data.containsValue(password)) {
                    System.out.println("Авторизация прошла успешно.");
                    break;
                } else {
                    throw new UserDoesntExistException("Пользователь с такими данными не существует");
                }
            } catch (UserDoesntExistException e) {
                System.out.println("Пользователь с такими данными не существует");
                captcha_entering();
                continue;
            }
        }
    }
}