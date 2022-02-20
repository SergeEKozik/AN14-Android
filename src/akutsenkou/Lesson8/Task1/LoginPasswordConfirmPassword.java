package akutsenkou.Lesson8.Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginPasswordConfirmPassword {
    public LoginPasswordConfirmPassword(){

    }

    public static void reg (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if(!LoginPasswordConfirmPassword.check(login)){
            throw new WrongLoginException("Wrong login exception");
        }
        if(!LoginPasswordConfirmPassword.check(password)){
            throw new WrongPasswordException("Wrong password exception");
        }
        if(!LoginPasswordConfirmPassword.check(confirmPassword)){
            throw new WrongPasswordException("Wrong confirm password exception");
        }
        if(!password.equals(confirmPassword)){
            throw new WrongPasswordException("Password and confirm password do not match");
        }

    }

    public static boolean check (String check){
        String regx = "^[a-zA-Z0-9_]{3,20}$";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(check);
        return matcher.matches();
    }
}
