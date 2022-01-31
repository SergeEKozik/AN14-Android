package eveshtard.TaskAN2;
//В переменную записываем число. Надо вывести на экран сколько в этом
//числе цифр и положительное оно или отрицательное. Например, "это
//однозначное положительное число". Достаточно будет определить, является ли
//число однозначным, двухзначным или трехзначным и более.

public class Task1 {

    public static void main(String[] args) {
        int number = 285889522;
        int pos = positive(number);
        int length = String.valueOf(number * pos).length();

        System.out.println("The count of the digits is " + length);
        System.out.println("The number is " + result(pos));
    }

    private static int positive(int d) {
        if (d > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    private static String result(int p) {
        if (p == -1) {
            return "negative";
        } else {
            return "positive";
        }
    }
}
