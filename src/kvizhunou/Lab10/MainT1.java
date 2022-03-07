package kvizhunou.Lab10;

public class MainT1 {
    public static void main(String[] args) {
        String[] men = {"Nik", "tom", "Luk"};
        Integer[] numbers = {1, 3, 5, 7, 9} ;
        Generick<String> stringGenerick = new Generick<>(men);
        Generick<Integer> integerGenerick = new Generick<>(numbers);
        System.out.println(stringGenerick.getValue(2));
        System.out.println(integerGenerick.getValue(1));

    }
}
