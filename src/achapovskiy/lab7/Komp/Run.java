package achapovskiy.lab7.Komp;

import achapovskiy.lab7.Komp.Function.ITurnON;
import achapovskiy.lab7.Komp.Function.Info;
import achapovskiy.lab7.Komp.Function.On;

public class Run {
    public static void main(String[] args) {
        On on = new On();
        Info info = new Info("intel",16,512,3);

        info.turnOnPC(on);
        info.turnOfPC(on);
        info.infoPC();









    }
}