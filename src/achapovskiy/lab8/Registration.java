package achapovskiy.lab8;

public class Registration implements IScanner{

    public static final int maxLogLenght = 20;
    public static final int maxPasLenght = 20;

    public static String login(){
        System.out.println("Login: ");
        return sc.nextLine();
    }

    public static String password(){
        System.out.println("Password: ");
        return sc.nextLine();
    }

    public static String confirmPassword(){
        System.out.println("Confirm Password: ");
        return sc.nextLine();
    }
}
