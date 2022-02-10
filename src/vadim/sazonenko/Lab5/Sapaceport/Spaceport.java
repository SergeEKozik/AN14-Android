package vadim.sazonenko.Lab5.Sapaceport;

public class Spaceport {

    private IStart check;

    public Spaceport(IStart check) {
        this.check = check;
    }

    void launch() {

        for (; ; ) {
            if (check.prelaunchCheck()) {
                check.startMotor();
                System.out.println("Обратный остчёт: ");
                for (int time = 10; time > 0; time--) {
                    System.out.println(time);
                }
                check.start();
                break;
            } else {
                System.out.println("Предстартовая проверка провалена" + '\n' + "Попробуйте ещё раз");
            }


        }
    }
}


