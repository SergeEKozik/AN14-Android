package VNazarov.Lab05.TaskA1;

public class MusicPlayer extends Technics{

    public MusicPlayer(String brand, String model, String goal){
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
    public void playMusic() {
        super.playMusic();
    }

    @Override
    public void stopMusic(){
        super.stopMusic();
    }

    @Override
    public void charge() {
        if (getBatteryWorkingAbility()) {
            if (isCharging == false) {
                isCharging = true;
                if (isMusicOn) System.out.println("Disable all actions first.");
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
    public void playVideo() {
        System.out.println("Can't play any video.");
    }

    @Override
    public void stopVideo(){
        System.out.println("Can't play any video.");
    }
}
