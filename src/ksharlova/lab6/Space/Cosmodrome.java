package ksharlova.lab6.Space;

import ksharlova.lab6.Space.Shuttle.Shuttle;

import java.util.concurrent.TimeUnit;

public class Cosmodrome{

    private IStart shuttle;

    public Cosmodrome(IStart shuttle){
        this.shuttle = shuttle;
    }

    public void startUp(IStart shuttle){
        if(shuttle.preStartSystemCheck()) {
            shuttle.startingEngines();
            countingDown();
            shuttle.start();
        } else {
            System.out.println("Предстартовая проверка провалена");
        }
    }

    public void countingDown() {
        for (int i = 10; i >= 0; i--){
            System.out.print(i + " ");
            try {
                TimeUnit.MILLISECONDS.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

}
