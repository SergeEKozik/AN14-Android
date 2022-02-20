package eveshtard.Lab8;

public class Shop {
    public static void main(String[] args) {
        if (Authorization.authorize()) {
            Captcha.validate();
        }
    }
}
