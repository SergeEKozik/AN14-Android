package akalevich.Lesson_10.Generics.Task_1;

public class MainApp {
    public static void main(String[] args) {
        String[] strings = {"asd", "fgh", "hjk"};
        Integer[] ints = {1,2,3,5,6};
        Generic<String> stringGeneric = new Generic<>(strings);
        Generic<Integer> integerGeneric = new Generic<>(ints);
        System.out.println(stringGeneric.getElement(2));
        System.out.println(integerGeneric.getElement(3));
    }
}
