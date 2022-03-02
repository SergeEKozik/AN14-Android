package skuksovsky.Lab10.Collections;

import java.util.Random;

public class Utils {
    public static int randomizer(int lowerLimit, int upperLimit) {
        Random random = new Random();
        int  x  =  lowerLimit + random.nextInt(upperLimit - lowerLimit + 1);
        return x;
    }
}
