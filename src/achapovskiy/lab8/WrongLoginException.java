package achapovskiy.lab8;

public class WrongLoginException extends Exception{
    public WrongLoginException(String discription){
        super(discription);
    }
}
