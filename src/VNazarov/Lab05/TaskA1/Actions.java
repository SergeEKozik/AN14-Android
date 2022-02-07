package VNazarov.Lab05.TaskA1;

public abstract class Actions extends Appliance implements IActions{

    public boolean isMusicOn, isVideoOn, isCharging;
    private boolean isBatteryWorkingAbility;

    public boolean getBatteryWorkingAbility(){
        return isBatteryWorkingAbility;
    }

    void setBatteryWorkingAbility(boolean isTrue){
        this.isBatteryWorkingAbility = isTrue;
    }

    public Actions (String brand, String model){
        super(brand, model);
    }

    @Override
    public void playMusic() {
        if (isMusicOn == false) {
            isMusicOn = true;
            System.out.println("Playing music...");
        } else System.out.print("Music is already playing.");
    }

    @Override
    public void stopMusic(){
        if (isMusicOn){
            isMusicOn = false;
            System.out.println("Music stopped.");
        } else System.out.println("Music isn't playing.");
    }

    @Override
    public void playVideo() {
        if(isVideoOn == false){
            isVideoOn = true;
            System.out.println("Playing video...");
        } else System.out.println("Video is already playing.");
    }

    @Override
    public void stopVideo(){
        if (isVideoOn){
            isVideoOn = false;
            System.out.println("Video stopped.");
        } else System.out.println("Video isn't playing.");
    }

    @Override
    public void charge() {
        if (isBatteryWorkingAbility) {
            if (isCharging == false) {
                isCharging = true;
                if (isVideoOn && isMusicOn) System.out.println("Disable all actions first.");
                else System.out.println("Charging...");
            } else System.out.println("Already charging.");
        } else System.out.println("The device can't be charged.");
    }

    @Override
    public void stopCharging() {
        if (isBatteryWorkingAbility) {
            if (isCharging) {
                isCharging = false;
                System.out.println("Charging stopped.");
            } else System.out.println("Device isn't charging.");
        }else System.out.println("The device can't be charged.");
    }
}
