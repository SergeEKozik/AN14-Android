package akalevich.Lesson_10.Generics.Task_2;

public class MainApp {

    public static final int COUNT_OF_ELEMENTS = 5;

    public static void main(String[] main) {
        Integer[] ints = {1,2,3,5,6,6,2,5,2,3,5,3,4};
        Catalog<Integer> catalog = new Catalog<>(ints);
        func(catalog);
    }

    private static void func(Catalog<Integer> catalog) {
        Integer[] array = catalog.getArray();
        for (int index = 0; index < COUNT_OF_ELEMENTS; index++) System.out.println(array[index]);
    }
}
