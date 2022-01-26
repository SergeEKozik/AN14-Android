
//6) Даны 2 числа. Вывести большее из них.
package eveshtard.TaskAN2;

public class Task6 {

    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        System.out.println(max(a, b));
    }

    private static int max(int d, int s) {
        if (d > s) {
            return d;
        } else {
            return s;
        }
    }
}
