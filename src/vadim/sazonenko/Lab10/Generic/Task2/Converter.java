package vadim.sazonenko.Lab10.Generic.Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Converter {
    public static <T> ArrayList<T> ConvertArray(T[] array) {
        return new ArrayList<T>(Arrays.asList(array));
    }
}
