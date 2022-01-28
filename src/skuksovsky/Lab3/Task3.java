package skuksovsky.Lab3;
import org.w3c.dom.css.CSSImportRule;

import java.util.*;
public class Task3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        long inputNumber = scanner.nextLong();
        scanner.close();

        String[] inputNumberArray = String.valueOf(inputNumber).split("");
        int spaceIndex = inputNumberArray.length % 3; // место, где должен быть вставлен первый пробел
        for (int i = 0; i < inputNumberArray.length; i++) {
            if (i != spaceIndex) {
                System.out.print(inputNumberArray[i]);
            } else {
                System.out.print(spaceIndex != 0 ? " " + inputNumberArray[i] : inputNumberArray[i]); // убираем ноль для нулевого индекса
                spaceIndex +=3; // определяем следующий индекс, где должен быть вставлен пробел
            }
        }

    }
}
