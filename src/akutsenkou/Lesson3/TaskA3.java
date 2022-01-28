package akutsenkou.Lesson3;
//Имеется целое число, следует вывести его в бухгалтерском формате.
//Т.е. начиная справа каждые три позиции отделяются пробелом. Например число
//20023143 должно быть выведено как 20 023 143

import java.util.Scanner;

public class TaskA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number;
        System.out.println("Введите число: ");
        number = sc.nextLine();
        char numberStrArray [] = number.toCharArray();
        int count = numberStrArray.length%3;
        for(int index = 0; index < numberStrArray.length; index++){
            if(index != count)
                System.out.print(numberStrArray[index]);
            else{
                System.out.print(count != 0 ? " " + numberStrArray[index] : numberStrArray[index]);
                count += 3;
            }
        }

    }
}
