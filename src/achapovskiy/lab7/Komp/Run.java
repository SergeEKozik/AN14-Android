package achapovskiy.lab7.Komp;

import achapovskiy.lab7.Komp.Function.ITurnON;
import achapovskiy.lab7.Komp.Function.On;

public class Run {
    public static void main(String[] args) {
        On on = new On();
        PC pc1 = new PC("intel", 16,512,3);

        pc1.turnOnPC(on);
        pc1.turnOfPC(on);









    }
}