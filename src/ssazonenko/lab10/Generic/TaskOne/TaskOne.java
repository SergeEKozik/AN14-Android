package ssazonenko.lab10.Generic.TaskOne;

import java.util.Scanner;

class TaskOne <T> {

    public TaskOne(T[] o) {
        this.o = o;
    }

    private T[] o;


    public T[] getO() {
        return o;
    }
    public void choose ( T [] array) {
        System.out.println("введите индекс");
        Scanner console = new Scanner(System.in);
        int numbers = console.nextInt();
        System.out.println(array[numbers]);
    }
}
