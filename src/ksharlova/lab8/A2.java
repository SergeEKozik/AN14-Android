package ksharlova.lab8;

/*      A2. Интернет-магазин. Аутентификация пользователя:
        Пусть у вас будет отображение, содержащие пары логин пользователь.
        Если пользователь ввел данные из этого отображения, он аутентифицирован.
        Если введенные логин, пароль не содержатся в отображении, проверяете их корректность.
*/

import ksharlova.lab8.Exeptions.WrongLoginException;
import ksharlova.lab8.Exeptions.WrongPasswordException;
import ksharlova.lab8.Exeptions.WrongVerificationExeption;
import ksharlova.lab8.User;


public class A2 {
public static void main(String[] args) throws WrongLoginException, WrongPasswordException, WrongVerificationExeption {
    User user1 = new User("Masha_00", "ggg", "ggg");
    System.out.println(user1.getLogin());
    System.out.println(user1.getPassword());
    System.out.println("Enter login information from picture");
    user1.userLoginVerification();
    System.out.println("Enter password information from picture");
    user1.userPasswordVerification();
}

}


