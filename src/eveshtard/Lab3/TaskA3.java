package eveshtard.Lab3;

import java.util.Arrays;

//Имеется целое число, следует вывести его в бухгалтерском формате.
//Т.е. начиная справа каждые три позиции отделяются пробелом. Например, число
//20023143 должно быть выведено как 20 023 143
public class TaskA3 {
    public static void main(String[] args) {
        int number = 20023143;
        System.out.println(toAccountingNumber(number));
    }

    private static String toAccountingNumber(int n) {
        int groupSize = 3;
        int numberLength = String.valueOf(n).length();
        int numStrLength = numberLength + (numberLength / groupSize);
        String[] numStr = new String[numStrLength];
        int count = 0;
        for (int i = 0; i < numStrLength; i++) {
            if (count == groupSize) {
                count = 0;
                numStr[numStrLength - i - 1] = " ";
            } else {
                numStr[numStrLength - i - 1] = String.valueOf(n % 10);
                n = n / 10;
                count++;
            }
        }
        String result = "";
        for (String digit : numStr) {
            result = result + digit;
        }
        return result;
    }

}
