package kdavydenko.Lesson10.Generics.TaskA2;

import java.util.List;

public class Catalog<T> {
    private List<T> list;

    public Catalog(List<T> list) {
        this.list = list;
    }

    public String[] getArrayString() {
        return list.toArray(new String[0]);
    }

    public Integer[] getArrayInteger() {
        return list.toArray(new Integer[0]);
    }

}
