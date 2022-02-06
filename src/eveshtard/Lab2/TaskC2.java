package eveshtard.Lab2;

public class TaskC2 {
    public static void main(String[] args) {
        int number = 5467;
        int result = 0;
        sumDigitInNumber(number, result);
    }

    private static void sumDigitInNumber(int num, int sum) {
        if (num != 0) {
            sum += num % 10;
            sumDigitInNumber(num / 10, sum);
        } else {
            System.out.println(sum);
        }
    }
}
