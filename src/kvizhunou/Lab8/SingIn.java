package kvizhunou.Lab8;

import java.util.regex.Pattern;


public class SingIn implements Scaner {
    public static final int maxLogLenght = 20;
    public static final int maxPassLenght = 20;

    public static void main(String[] args) {
        Autorisation(log(), pass(), passAgain());
    }


    public static String log() {
        System.out.println("Login");
        return scaner.nextLine();
    }

    public static String pass() {
        System.out.println("Password");
        return scaner.nextLine();
    }

    public static String passAgain() {
        System.out.println("Again Password");
        return scaner.nextLine();
    }

    public static void Autorisation(String log, String pass, String passAgain) {

        try {
            if (log.length() >= maxLogLenght || !Pattern.matches("^[v-xA-jF-H1_]+$", log))
                throw new WrongLoginException();
                if (pass.length() >= maxPassLenght || !Pattern.matches("^[v-xA-jF-H1_]+$", pass))
                    throw new WrongPaasswordException();
                    if (!pass.equals(passAgain))
                        throw new WrongPassAgainException();
                }
                catch(WrongLoginException) {
                        System.out.println("Неверный логин");
                }
         catch(WrongPaasswordException) {
                        System.out.println("Неверный пароль");
                }
         catch(WrongPassAgainException) {
                        System.out.println("Пароль подтвержден");
                        }

            }
        } finally {

        }
    }
    }