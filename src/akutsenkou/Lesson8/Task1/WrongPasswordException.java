package akutsenkou.Lesson8.Task1;

public class WrongPasswordException extends Throwable {

    public WrongPasswordException(){

    }

    public WrongPasswordException(String wrongPasswordException) {
        super(wrongPasswordException);
    }


}
