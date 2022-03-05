package VNazarov.Lab10.Generics.TaskB1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convert<T> {
    private T[] massive;

    public Convert() {
    }

    public List<T> convertMassToList(T[] massive){
        this.massive = massive;
        List<T> list = new ArrayList<>(Arrays.asList(massive));
        return list;
    }
}
