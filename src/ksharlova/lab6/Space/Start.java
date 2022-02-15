package ksharlova.lab6.Space;

import ksharlova.lab6.Space.Shuttle.Baikonur;
import ksharlova.lab6.Space.Shuttle.KSC;
import ksharlova.lab6.Space.Shuttle.SpaceX;

public class Start {
    public static void main(String[] args){
        SpaceX shuttleSpaceX = new SpaceX();
        Cosmodrome spaceX = new Cosmodrome(shuttleSpaceX);
        spaceX.startUp(shuttleSpaceX);

        Baikonur shuttleBaikonur = new Baikonur();
        Cosmodrome baikonur = new Cosmodrome(shuttleBaikonur);
        baikonur.startUp(shuttleBaikonur);

        KSC shuttleKSC = new KSC();
        Cosmodrome ksc = new Cosmodrome(shuttleKSC);
        ksc.startUp(shuttleKSC);
    }
}
