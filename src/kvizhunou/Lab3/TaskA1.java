package kvizhunou.Lab3;

public class TaskA1 {
    public static void main(String[] args) {
        int n = sumDigiInNamber(354);
        System.out.println(n);
    }

    public static int sumDigiInNamber(int number) {
        int sum = 0;
        sum = sum + number % 10;
        sum = sum + number / 100;
        sum = sum + (number / 10) % 10;
        return sum;
    }
}
