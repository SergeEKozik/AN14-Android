package kdavydenko.Lesson5.Space;

public class Spaceport {


    public Spaceport() {

    }

    public void launch(IStart iStart) {
        if (iStart.prelaunchCheck()) {
            iStart.engineStart();
            for (int i = 10; i >= 0; i--)
                System.out.println(i);
            iStart.start();
        } else
            System.out.println("Предстартовая проверка провалена");

    }
}
