package akutsenkou.Lesson8.Task1;

public class Run {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        LoginPasswordConfirmPassword login = new LoginPasswordConfirmPassword();
        login.reg("Andrey_123", "OrtOp_23", "OrtOp)23");

    }
}
