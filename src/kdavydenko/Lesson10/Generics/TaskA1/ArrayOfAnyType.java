package kdavydenko.Lesson10.Generics.TaskA1;


import java.util.List;

public class ArrayOfAnyType<T> {

    private List<T> list;

    public ArrayOfAnyType(List<T> list) {
        this.list = list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public T getElementById(Integer id){
        return this.list.get(id);
    }
}
