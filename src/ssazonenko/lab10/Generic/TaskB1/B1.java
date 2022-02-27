package ssazonenko.lab10.Generic.TaskB1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B1 <T> {
    private  T [] numbers;

    public B1(T [] numbers) {
        this.numbers = numbers;
    }

    public T [] getNumbers() {
        return numbers;
    }
    public <T> void converter(){
        List<T> list = (List<T>) List.of(getNumbers());
        System.out.println(list);
    }
}
