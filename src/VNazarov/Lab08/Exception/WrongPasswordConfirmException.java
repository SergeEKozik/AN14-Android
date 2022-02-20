package VNazarov.Lab08.Exception;

public class WrongPasswordConfirmException extends Exception{
    public WrongPasswordConfirmException(){
        String detail = "Invalid password confirm, try again.";
        System.out.println(detail);
    }
}
