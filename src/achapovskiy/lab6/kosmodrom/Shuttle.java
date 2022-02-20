package achapovskiy.lab6.kosmodrom;

public class Shuttle implements IStart {
    public boolean preLaunchCheck() {
        double num = Math.random()*10;
        boolean rezCheck = num>3;
        return rezCheck;
    }

    @Override
    public void engineStart() {

        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}



