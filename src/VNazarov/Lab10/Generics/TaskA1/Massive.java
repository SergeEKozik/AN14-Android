package VNazarov.Lab10.Generics.TaskA1;

public class Massive<T> {
    private T[] massive;

    public Massive(T[] massive) {
        this.massive = massive;
    }

    public T getElement(int index){
        return massive[index];
    }
}
