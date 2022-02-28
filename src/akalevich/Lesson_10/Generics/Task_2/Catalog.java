package akalevich.Lesson_10.Generics.Task_2;

public class Catalog<T> {
    private T[] array;

    public Catalog(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }
}
