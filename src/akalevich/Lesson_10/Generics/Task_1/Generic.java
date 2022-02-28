package akalevich.Lesson_10.Generics.Task_1;

public class Generic<T> {

    private T[] value;

    public Generic(T[] value) {
        this.value = value;
    }

    public T getElement(int index) {
        return value[index];
    }
}
