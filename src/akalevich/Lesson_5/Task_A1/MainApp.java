package akalevich.Lesson_5.Task_A1;

import akalevich.Lesson_5.Task_A1.Classes.PanasonicTV;
import akalevich.Lesson_5.Task_A1.Classes.SonyTV;

public class MainApp {

    public static void main(String[] args)
    {
        PanasonicTV panasonicTV = new PanasonicTV("dakang" , true);
        panasonicTV.turnTvOnNet();
        panasonicTV.turnTvOn();
        panasonicTV.volumeDown();
        panasonicTV.volumeDown();
        panasonicTV.setVolume(13);
        panasonicTV.volumeUp();
        panasonicTV.setChannel(7);
        panasonicTV.channelDown();
        panasonicTV.turnTvOFFNet();
        panasonicTV.turnTvOn();
        SonyTV sonyTV = new SonyTV("franchesco",false);
        sonyTV.turnTvOnNet();
        sonyTV.turnTvOn();
        sonyTV.volumeDown();
        sonyTV.volumeDown();
        sonyTV.setVolume(13);
        sonyTV.volumeUp();
        sonyTV.setChannel(7);
        sonyTV.channelDown();
        sonyTV.turnTvOFFNet();
        sonyTV.turnTvOn();
    }
}
