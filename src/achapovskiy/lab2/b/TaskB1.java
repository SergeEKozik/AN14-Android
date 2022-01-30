package achapovskiy.lab2.b;

public class TaskB1 {
    public static void main(String[] args) {
        double d = 111.111;   //возможно ошибка в условии, вместо int должно быть double
        byte b = 0b111;
        long o = 0111L;
        int h = 0x111;
        float f = 111.111f;
        System.out.println(d +" " + b +" " + o +" " + h +" " + f );
    }
}
