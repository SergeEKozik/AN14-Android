package VNazarov.Lab10.Generics.TaskA1;

public class Run {
    public static void main(String[] args) {
        String[] str = {"qwe", "rty", "123", "456"};

        Massive<String> massStr = new Massive<>(str);
        System.out.println(massStr.getElement(2));
    }
}
