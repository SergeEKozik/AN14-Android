package skuksovsky.Lab10.Generics.A1Array;

public class Main {
    public static void main(String[] args) {
        Array data = new Array();
        data.addData("a");
        data.addData(1000);
        data.addData(122332322232L);
        System.out.println(data.showElement(0));

    }
}
