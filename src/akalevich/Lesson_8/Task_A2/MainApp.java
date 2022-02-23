package akalevich.Lesson_8.Task_A2;

import akalevich.Lesson_8.Task_A2.Exceptions.WrongLoginException;
import akalevich.Lesson_8.Task_A2.Exceptions.WrongPasswordException;

public class MainApp implements IScanner {

    public static void main(String[] args) {
        User user1 = new User("Login_1", "Password_1");
        User user2 = new User("Login_2", "Password_2");
        User user3 = new User("Login_3", "Password_3");
        showUsers(user1, user2, user3);
        authentication(user1, user2, user3);
    }

    public static void showUsers(User... users) {
        for (User user : users) {
            user.showLogin();
            user.showPassword();
            System.out.println();
        }
    }

    public static void authentication(User... users) {
        try {
            loginCheck(users);
        }
        catch (WrongLoginException exception) { System.out.println("Incorrect Login."); }
        catch (WrongPasswordException exception) { System.out.println("Incorrect Password."); }
    }

    private static void loginCheck(User[] users) throws WrongLoginException, WrongPasswordException {
        System.out.print("Input Login: ");
        String login = scan.nextLine();
        for (User user: users) {
            if (login.equals(user.getLogin())) { passwordCheck(user); return; }
        }
        throw new WrongLoginException();
    }

    private static void passwordCheck(User user) throws WrongPasswordException{
        System.out.print("Input Password: ");
        if (scan.nextLine().equals(user.getPassword())) System.out.println("Authentication passed.");
        else throw new WrongPasswordException();
    }
}
