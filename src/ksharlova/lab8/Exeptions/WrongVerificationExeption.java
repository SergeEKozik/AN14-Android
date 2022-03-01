package ksharlova.lab8.Exeptions;

public class WrongVerificationExeption extends Exception {
    private String detail;

    public WrongVerificationExeption() { detail = "Incorrect password or login"; }

    public WrongVerificationExeption(String message) {
        super(message);
        detail = message;
    }

    @Override
    public String toString() {
        return "WrongVerificationExeption: " + detail;
    }

}
