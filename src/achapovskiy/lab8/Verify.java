package achapovskiy.lab8;

import java.util.regex.Pattern;

public class Verify extends Registration {
    private static String pass;

    public static void verLog(String login) throws WrongLoginException {
        boolean TrueOrFalse = Pattern.matches("^[A-Za-z0-9_]+$",login);
        if(login.length() >= maxLogLenght || !TrueOrFalse){
            System.out.println("ошибка");
            throw new WrongLoginException();
        }
    }
    public static void verPas(String password) throws WrongPasswordException{
        boolean TrueOrFalse = Pattern.matches("^[A-Za-z0-9_]+$",password);
        if(password.length() >= maxPasLenght || !TrueOrFalse){
            System.out.println("ошибка");
            throw new WrongPasswordException();
        }
        else{
            pass=password;
        }
    }
   public static void verPasConf(String confirmPassword) throws WrongPasswordException{
        if(!confirmPassword.equals(pass)){
            System.out.println("ошибка");
            throw new WrongPasswordException();
        }
    }}

