package achapovskiy.lab8;

public class Run {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Registration reg = new Registration();
        Verify verify = new Verify();
        Verify.verLog(Registration.login());
        Verify.verPas(Registration.password());
        //Verify.verPasConf(Registration.confirmPassword());







    }
}