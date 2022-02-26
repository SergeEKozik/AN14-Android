package vadim.sazonenko.Lab10.Generic.TaskB1;

import java.util.ArrayList;
import java.util.Arrays;

public class Converter {
    public static <T> ArrayList<T> ConvertArray(T[] array) {
        return new ArrayList<T>(Arrays.asList(array));
    }
}
