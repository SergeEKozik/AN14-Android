package VNazarov.Lab10.Generics.TaskB1;

import java.util.List;

public class Run {
    public static void main(String[] args) {
        Integer[] intMassive = {1,2,3,4,5,6,7,8,9,10};
        String[] stringMassive = {"1123123456", "1243443434", "523423443"};

        Convert<Integer> intConvert = new Convert<>();
        List<Integer> listInt = intConvert.convertMassToList(intMassive);

        Convert<String> stringConvert = new Convert<>();
        List<String> listStr = stringConvert.convertMassToList(stringMassive);

        System.out.println(listInt);
        System.out.println(listStr);
    }
}
