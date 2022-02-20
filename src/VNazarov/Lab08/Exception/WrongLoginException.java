package VNazarov.Lab08.Exception;

public class WrongLoginException extends Exception{
    public WrongLoginException(){
        String detail = "Invalid login, try again.";
        System.out.println(detail);
    }
}
