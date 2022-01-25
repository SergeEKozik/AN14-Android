package skozik.lesson2.a;

public class A2 {
    public static void main(String[] args) {
        var a = "Буря небо вьюгой кроет,";
        var b = "Вихри снежные крутя.";
        var c = "То как зверь она завоет,";
        var d = "То заплачет, как дитя.";
        String result =
            "Моё любимое стихотворение:\n" +
                "\n" +
                a + "\n" +
                b + "\n" +
                c + "\n" +
                d;
        System.out.printf("%s%nКоличество символов: %d%n", result, result.length());
    }
}
