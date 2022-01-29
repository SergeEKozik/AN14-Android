package eveshtard.Lab3;

import java.util.Arrays;

//Имеется целое число, следует вывести его в бухгалтерском формате.
//Т.е. начиная справа каждые три позиции отделяются пробелом. Например число
//20023143 должно быть выведено как 20 023 143
public class TaskA3 {
    public static void main(String[] args) {
        int number = 20023143;
        int groupSize = 3;
        int numberLength = (int) (Math.log10(number) + 1);
        int[] numberArray = new int[numberLength];
       summa(number, numberArray);

    }

    public static void summa(int n, int[] numA) {

        for (int i = 0; i < numA.length; i++) {
            numA[numA.length - i - 1] = n % 10;
            n = n / 10;
        }
        System.err.println(Arrays.toString(numA));
    }

}
