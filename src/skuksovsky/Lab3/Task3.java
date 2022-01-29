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
        int spaceIndex = inputNumberArray.length % 3; // индекс, где должен быть вставлен первый пробел
        if ((spaceIndex == 0) | (inputNumber < 0 & spaceIndex == 1)) spaceIndex +=3; // убираем пробел для 0 индекса и для 1 для отрицательных
        for (int i = 0; i < inputNumberArray.length; i++) {
            if (i != spaceIndex) {
                System.out.print(inputNumberArray[i]);
            } else {
                System.out.print( " " + inputNumberArray[i]); // вставляем пробел в нужном месте, исключение для 0-го индекса и для 1-го если число отриц
                spaceIndex +=3; // определяем следующий индекс, где должен быть вставлен пробел
            }
        }

    }
}
