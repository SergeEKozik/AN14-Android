package VNazarov.Lab08.Exception;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(){
        String detail = "Invalid password, try again.";
        System.out.println(detail);
    }
}
