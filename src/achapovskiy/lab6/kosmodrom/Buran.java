package achapovskiy.lab6.kosmodrom;

import java.util.Locale;
import java.util.Scanner;

public class Buran implements IStart{
    public boolean preLaunchCheck() {
        System.out.print("\nКакая страна создала Буран? Ваш ответ: ");
        Scanner sc = new Scanner(System.in);
        boolean rezCheck;
        String country = sc.nextLine().toLowerCase(Locale.ROOT);
        if(country.equals("ussr") || country.equals("cccр") || country.equals("советский союз")){
            rezCheck = true;
            System.out.println("Верно!");
        }
        else {
            rezCheck = false;
        }
        return rezCheck;
    }

    @Override
    public void engineStart() {

        System.out.println("Двигатели Бурана запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Поехали!");
    }
}

