package VNazarov.Lab05.TaskA1;

public class VideoPlayer extends Technics {

    public VideoPlayer (String brand, String model, String goal){
        super(brand, model, goal);
    }

    @Override
    void setBatteryWorkingAbility(boolean isTrue) {
        super.setBatteryWorkingAbility(isTrue);
    }

    @Override
    public boolean getBatteryWorkingAbility() {
        return super.getBatteryWorkingAbility();
    }

    @Override
    public void playVideo() {
        super.playVideo();
    }

    @Override
    public void stopVideo() {
        super.stopVideo();
    }

    @Override
    public void charge() {
        if (getBatteryWorkingAbility()) {
            if (isCharging == false) {
                isCharging = true;
                if (isVideoOn) System.out.println("Disable all actions first.");
                else System.out.println("Charging...");
            } else System.out.println("Already charging.");
        } else System.out.println("The device can't be charged.");
    }

    @Override
    public void stopCharging() {
        if (getBatteryWorkingAbility()) {
            if (isCharging) {
                isCharging = false;
                System.out.println("Charging stopped.");
            } else System.out.println("Device isn't charging.");
        }else System.out.println("The device can't be charged.");
    }

    @Override
    public void playMusic() {
        System.out.println("Can't play any music.");
    }

    @Override
    public void stopMusic(){
        System.out.println("Can't play any music.");
    }
}
