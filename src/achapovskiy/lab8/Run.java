package achapovskiy.lab8;

public class Run {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        Verify.verLog(Registration.login());
        Verify.verPas(Registration.password());
        Verify.verPasConf(Registration.confirmPassword());







    }
}