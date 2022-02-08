package akalevich.Lesson_5.Task_A1.services;

abstract class TV extends LoungeApps {

    private int volume;
    private int channel;

    int getVolume() {
        return volume;
    }

    int getChannel() {
        return channel;
    }

    TV(String name, boolean remoteControllerExist) {
        super(name, remoteControllerExist);
    }

    public void turnTvOnNet() {
        this.setNutrition(true);
        System.out.println("TV nutrition is ON");
    }

    public void turnTvOn() {
        this.setPower(true);
        this.channel = 1;
        this.volume = 1;
        if(this.isNutrition() == true)
        {
            if (this.isRemoteControllerExist() == true)
                System.out.println("TV is ON, TV has remote controller, Channel = 1, Volume = 1");
            else System.out.println("TV is ON, TV hasn't remote controller, Channel = 1, Volume = 1");
        }
        else System.out.println("First turn on nutrition");
    }

    public void turnTvOFFNet() {
        this.setNutrition(false);
        this.setPower(false);
        System.out.println("TV nutrition is OFF");
    }

    public void turnTvOFF() {
        this.setPower(false);
        System.out.println("TV is OFF");

    }

    void volumeUp() {
        this.volume++;
        System.out.println("Volume = " + this.volume);
    }

    public void volumeDown() {
        if (this.volume > 0) {
            this.volume--;
            System.out.println("Volume = " + this.volume);
        } else System.out.println("You can't set volume less than 0");
    }

    void setVolume(int volume) {
        if (volume >= 0) {
            this.volume = volume;
            System.out.println("Volume = " + this.volume);
        } else System.out.println("You can't set volume less than 0");
    }

    void channelUp() {
        this.channel++;
        System.out.println("Channel = " + this.channel);
    }

    public void channelDown() {
        if (this.channel > 0) {
            this.channel--;
            System.out.println("Channel = " + this.channel);
        } else System.out.println("You can't set channel less than 0");
    }

    void setChannel(int channel) {
        if (channel >= 0) {
            this.channel = channel;
            System.out.println("Channel = " + this.channel);
        } else System.out.println("You can't set channel less than 0");
    }
}
