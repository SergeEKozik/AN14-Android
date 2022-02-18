package eveshtard.Lab8;

import java.util.Random;
import java.util.Scanner;

public class Captcha {
    private static int count = 0;

    public static void validate() {
        int random = new Random().nextInt(99, 999);
        System.out.println("Enter number " + random);
        Scanner console = new Scanner(System.in);
        count++;
        if (random == console.nextInt()) {
            System.out.println("Login successful");
        } else {
            if (count >= 3) {
                try {
                    throw new WrongCaptchaException("Try login later");
                } catch (WrongCaptchaException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Try again");
            validate();
        }
    }
}
