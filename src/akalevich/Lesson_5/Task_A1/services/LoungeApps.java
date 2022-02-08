package akalevich.Lesson_5.Task_A1.services;

abstract class LoungeApps extends Appliances {

    private boolean remoteControllerExist;

    boolean isRemoteControllerExist() {
        return remoteControllerExist;
    }

    LoungeApps(String name, boolean remoteControllerExist) {
        super(name);
        this.remoteControllerExist = remoteControllerExist;
    }
}
