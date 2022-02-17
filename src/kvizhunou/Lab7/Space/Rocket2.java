package kvizhunou.Lab7.Space;

public class Rocket2 implements IStart{


    @Override
    public boolean preStart() {
        return Math.random()*10>3;
    }

    @Override
    public void engStart() {
        System.out.println("Двигатель Ракеты1 запущен.Все системы в норме");

    }

    @Override
    public void start() {
        System.out.println("Старт Рокеты2");

    }
}
