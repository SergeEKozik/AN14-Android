package ksharlova.lab6.Space.Shuttle;

import ksharlova.lab6.Space.IStart;

import java.util.Random;

public abstract class Shuttle implements IStart{

    @Override
    public boolean preStartSystemCheck() {
        Random rand = new Random();
        int start = rand.nextInt(11);
        if(start > 3) {
            return true;
        } else { return false; }
    }
}
