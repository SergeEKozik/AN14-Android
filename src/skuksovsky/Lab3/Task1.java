package skuksovsky.Lab3;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int inputNumber = scanner.nextInt();
        scanner.close();

        String[] numberArr = String.valueOf(inputNumber).split("");
        int counter = inputNumber >= 0 ? 0 : 1; // если введенное число отрицательное, то перебор элементов начать с элемента с индексом 1
        int totalSum = 0;
        while(counter < numberArr.length){
            totalSum += Integer.valueOf(numberArr[counter]);
            counter++;
        }

        System.out.println("Сумма цифр введенного числа: " + totalSum);
    }

}
