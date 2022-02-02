package skuksovsky.Lab4;
import java.util.*;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строки (end для завершения ввода): ");
        StringBuilder inputStrings = new StringBuilder();
        while (sc.hasNextLine()) {
            String inputString = sc.nextLine();
            if (!inputString.equals("end")) {
                inputStrings.append(inputString).append("SPLIT_HERE");
            } else {
                sc.close();
                break;
            }
        }

        String[] totalStringArray = inputStrings.toString().split("SPLIT_HERE");

        int length = 0;
        for (String str: totalStringArray) {
            length += str.length();
        }

        System.out.println("Строки, чья длина превышает среднюю (средняя длина - " + length / totalStringArray.length + "): ");
        for (String str: totalStringArray) {
            if (str.length() > length / totalStringArray.length) System.out.println(str);
        }

    }
}
