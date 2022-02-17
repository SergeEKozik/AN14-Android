package akalevich.Lesson_7.computer;

import akalevich.Lesson_7.computer.impl.ICPU;
import akalevich.Lesson_7.computer.impl.IRAM;
import akalevich.Lesson_7.computer.impl.ISSD;
import akalevich.Lesson_7.computer.impl.IComputer;

public class Computer implements IComputer {

    private ICPU cpu;
    private IRAM ram;
    private ISSD ssd;
    private int powerResource;
    private boolean onState;
    private boolean burnedOut;

    public Computer(ICPU cpu, IRAM ram, ISSD ssd) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        burnedOut = true;
        powerResource = powerResourceCount(cpu.getResourсe(), ram.getResourсe(), ssd.getResourсe());
        System.out.println("Resource Count: " + powerResource);
    }

    private boolean isBurnedOut() { return burnedOut; }

    private int powerResourceCount(int... resources) {
        int minResource = resources[0];
        for (int index : resources) if (minResource < index) minResource = index;
        return minResource;
    }

    private boolean powerResourceCheck() {
        if (powerResource != 0) { powerResource--; return true; }
        else {
            System.out.println("The resource of power ON iterations has dried up");
            this.burnedOut = false;
            return false;
        }
    }

    private boolean renderSuccess() {
        if (cpu.cpuRenderSuccess() && ram.ramRenderSuccess() && ssd.infoFlowProcessingSuccess()) return true;
        else {
            this.burnedOut = false;
            return false;
        }
    }

    private boolean isONorOFF() {
        if (onState) return true;
        else return false;
    }

    public void showInfo() {
        cpu.showInfo();
        ram.showInfo();
        ssd.showInfo();
    }

    public void turnON() {
        if (!isONorOFF() && isBurnedOut() && powerResourceCheck() && renderSuccess()) {
            onState = true;
            System.out.println("Computer power ON, resource power is: " + powerResource);
        }
    }

    public void turnOFF() {
        if (isONorOFF()) { System.out.println("Computer Power OFF"); onState = false;}
    }

}
