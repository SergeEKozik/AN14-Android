package akutsenkou.Lesson10.Lab1;
//Вычислить сколько раз каждая буква встречается в тексте.

public class Main {
    public static void main(String[] args) {
        UniqueChars uc = new UniqueChars();
        uc.setText("aaasssddddfgdfge");
        uc.calculate();
        System.out.println(uc.toString());
    }
}
