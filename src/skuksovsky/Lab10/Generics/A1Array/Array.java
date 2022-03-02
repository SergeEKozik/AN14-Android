package skuksovsky.Lab10.Generics.A1Array;

import java.util.ArrayList;
import java.util.List;

public class Array {
    private List<Object> data;

    public Array() {
        data = new ArrayList<>();
    }

    public void addData(Object data){
        this.data.add(data);
    }

    public Object showElement(int index) {
        return data.get(index);
    }
}
