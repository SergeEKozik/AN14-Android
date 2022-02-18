package eveshtard.Lab8;
/*Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
Login должен содержать только латинские буквы, цифры и знак подчеркивания.
Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям,
необходимо выбросить WrongLoginException.
Password должен содержать только латинские буквы, цифры и знак подчеркивания.
Длина password должна быть меньше 20 символов.
Также password и confirmPassword должны быть равны. Если password не соответствует этим требованиям,
необходимо выбросить WrongPasswordException.
WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию,
второй принимает сообщение исключения и передает его в конструктор класса Exception.
Обработка исключений проводится внутри метода. Используем multi-catch block.
Метод возвращает true, если значения верны или false в другом случае.
2. Интернет-магазин. Аутентификация пользователя:
Пусть у вас будет отображение, содержащие пары логин пользователь.
Если пользователь ввел данные из этого отображения, он аутентифицирован.
Если введенные логин, пароль не содержатся в отображении, проверяете их корректность.*/


import java.util.Scanner;

public class Authorization {
    private static final String PATTERN = "^[A-Za-z0-9_]{0,20}$";

    public static boolean authorize() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login");
        String login = scanner.nextLine();
        System.out.println("Enter password");
        String password = scanner.nextLine();
        System.out.println("Enter confirmPassword");
        String confirmPassword = scanner.nextLine();
        return authorization(login, password, confirmPassword);
    }

    public static boolean authorization(String login, String password, String confirmPassword) {

        try {
            if (!login.matches(PATTERN)) {
                throw new WrongLoginException("Wrong Login: " + login);
            }
            if (!password.matches(PATTERN) || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Wrong Password " + password);
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
        }
        return true;
    }
}
