package ssazonenko.lab8;

import ssazonenko.lab8.excaption.WrongCaptchaException;

import java.util.Scanner;

public class Captcha {
    static int captcha;
    static final int VERIFICATION = 1231116;

    public static void captcha() {
        try {
            System.out.println("Для входа введите:" + VERIFICATION);
            Scanner console = new Scanner(System.in);
            captcha = console.nextInt();
            if (captcha == VERIFICATION) {
                System.out.println("Символы совпали");
            } else {
                throw new WrongCaptchaException();
            }
        } catch (WrongCaptchaException e) {
            System.out.println("Попробуйте еще раз");
            captcha();
        }
    }
}
