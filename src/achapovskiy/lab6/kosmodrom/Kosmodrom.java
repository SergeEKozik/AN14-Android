package achapovskiy.lab6.kosmodrom;

public class Kosmodrom {

    public void launch(IStart object) {
        if (object.preLaunchCheck()) {
            object.engineStart();
            for (int countdown = 10; countdown > 0; countdown--) {
                System.out.println(countdown);
            }
            object.start();
        }
            else{
                System.out.println("Предстартовая проверка провалена");
        }
    }
}
