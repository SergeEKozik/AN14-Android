package akalevich.Lesson_7.Computer.Accessories.CPU;

public class IntelCPU implements ICPU {

    private static final int INTEL_CPU_RESOURCE = 10;

    public boolean cpuRenderSuccess() {
        if ((int) (Math.random() * INTEL_CPU_RESOURCE) != 0) return true;
        else {
            System.out.println("CPU render Error");
            return false;
        }
    }

    public void showInfo() {
        System.out.println("CPU: Intel");
    }

    public int getResource() { return INTEL_CPU_RESOURCE;}
}


