package eveshtard.Lab10.Generics;

//Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
//Реализовать метод, который возвращает любой элемент массива по индексу.

public class AllTypes<T> {
    private T[] allTypes;

    public T[] getAllTypes() {
        return allTypes;
    }

    public void setAllTypes(T[] allTypes) {
        this.allTypes = allTypes;
    }

    public T get(int index) {
        return allTypes[index];
    }

}
