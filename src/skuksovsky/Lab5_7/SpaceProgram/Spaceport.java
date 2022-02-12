package skuksovsky.Lab5_7.SpaceProgram;

import java.util.concurrent.TimeUnit;

public class Spaceport {

     public void launch(IStart iStart) throws InterruptedException {

        boolean startCheckResult = iStart.startCheck();

        if (startCheckResult) {
            iStart.engineStart();
            System.out.println("Начинаем обратный отсчет");
            countdown(10);
            iStart.launch();
        } else {
            System.out.println("Предстартовая проверка " + iStart.getName() + " провалена!");
        }

    }

    void countdown(int number) throws InterruptedException {
        for (int i = number; i > 0; i--) {
            System.out.println(i + "...");
            TimeUnit.SECONDS.sleep(1);
        }
    }



}
