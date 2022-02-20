package skuksovsky.Lab8.Task1_2.Exceptions;

public class UserDoesntExistException extends Exception{
    public UserDoesntExistException(String message) {
        super(message);
    }
}
