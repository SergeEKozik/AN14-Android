package vkorzykov.Lab3;

public class TaskAdd1 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 2; i <= 20; i=i+2) {
            if (i % 2 == 0) {
                a++;
            }
        }
        int[] array = new int[a];
        for (int i = 2, b = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                array[b] = i;
                System.out.print(array[b] + " ");
                b++;
            }
        }
        System.out.println(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);


        }
    }
}