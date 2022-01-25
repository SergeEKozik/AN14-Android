package skuksovsky.Lab2;
import javax.sound.midi.Soundbank;
import java.util.*;

public class TaskC1 {
    public static double convertCelsiumToFarenheit(int celsium){
        double tempFar = celsium * 1.8 + 32;
        return tempFar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите тепературу в град. Цельсия: ");
        int tempCels = sc.nextInt();
        sc.close();

        System.out.println("По шкале Фаренгейта это составляет " + convertCelsiumToFarenheit(tempCels) + " градусов");
    }
}
