package VNazarov.Lab08.UserData;
import VNazarov.Lab08.Exception.WrongLoginException;
import VNazarov.Lab08.Exception.WrongPasswordConfirmException;
import VNazarov.Lab08.Exception.WrongPasswordException;

import java.util.Scanner;

public class User {
    private String login;
    private String password;
    private String name;
    private static final String loginPasswordCheck = "^[a-zA-Z0-9_]{1,20}";

    static Scanner sc = new Scanner(System.in);

    public User(){}
    public User (String name){
        System.out.println("New user registration:");
        this.name = name;
        try{
            loginException();
            passwordException();
            confirmPasswordException();
        }catch (WrongLoginException | WrongPasswordException | WrongPasswordConfirmException ignored){}
        System.out.println("New user " + name + " created.\n");
    }

    private void loginException() throws WrongLoginException{
        System.out.print("Login: ");
        setLogin(sc.nextLine());
        if (!login.matches(loginPasswordCheck)){
            throw new WrongLoginException();
        }
    }
    private void passwordException() throws WrongPasswordException{
        System.out.print("Password: ");
        setPassword(sc.nextLine());
        if (!password.matches(loginPasswordCheck)){
            throw new WrongPasswordException();
        }
    }
    private void confirmPasswordException() throws WrongPasswordConfirmException {
        System.out.print("Confirm password: ");
        String passwordConfirm = sc.nextLine();
        if (!passwordConfirm.matches(password)){
            throw new WrongPasswordConfirmException();
        }
    }

    public String getLogin(){
        return login;
    }
    public String getPassword() {
        return password;
    }
    public String getName() {
        return name;
    }

    private void setLogin(String login) {
        this.login = login;
    }
    private void setPassword(String password) {
        this.password = password;
    }


}
