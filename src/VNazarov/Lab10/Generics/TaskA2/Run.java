package VNazarov.Lab10.Generics.TaskA2;

public class Run {
    public static void main(String[] args) {
        Integer[] intMas = {1,2,3,4,5,6,7,8,9};
        Double[] doubleMas = {1.2, 2.3};

        Catalog<Integer> intCat = new Catalog<>(intMas);
        Catalog<Double> doubleCat = new Catalog<>(doubleMas);

        String[] out = intCat.getFive();
        for (String s : out) {
            System.out.print(s + " ");
        }

        System.out.println();

        out = doubleCat.getFive();
        for (String s : out) {
            System.out.print(s + " ");
        }
    }
}
