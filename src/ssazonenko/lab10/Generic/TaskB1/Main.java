package ssazonenko.lab10.Generic.TaskB1;

public class Main {
    public static void main(String[] args) {
        Integer [] intArray = new Integer[]{22 , 12 , 35 ,  35 , 78};
        B1 <Integer> arrayInt = new B1<>(intArray);
        arrayInt.converter();
        String [] stringArray = new String[]{"Книга" , "Терадь" , "Работа", "Цветы"};
        B1 <String>  arrayString = new B1<>(stringArray);
        arrayString.converter();
    }
}
