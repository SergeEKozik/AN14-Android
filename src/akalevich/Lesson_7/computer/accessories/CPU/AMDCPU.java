package akalevich.Lesson_7.computer.accessories.CPU;

import akalevich.Lesson_7.computer.impl.ICPU;

public class AMDCPU implements ICPU {

    private static final int AMD_CPU_RESOURCE = 5;

    public boolean cpuRenderSuccess() {
        if ((int) (Math.random() * AMD_CPU_RESOURCE) != 0) return true;
        else {
            System.out.println("CPU render Error");
            return false;
        }
    }

    public void showInfo() { System.out.println("CPU: AMD"); }

    public int getResourсe() { return AMD_CPU_RESOURCE;}
}
