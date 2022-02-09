package akalevich.Lesson_5.Task_A1.services;

public class SonyTV extends TV{

    public SonyTV(String name, boolean remoteControllerExist) {
        super(name, remoteControllerExist);
        if (remoteControllerExist == true) System.out.println("Now You have TV from Sony. Max volume = 10, This Device have 15 channels. User Name = " + this.getName() + " and You have remote controller for this device");
        else System.out.println("Now You have TV from Sony. Max volume = 10, This Device have 15 channels. User Name = " + this.getName() + " and You haven't remote controller for this device");
    }

    public void volumeUp()
    {
        if (this.getVolume() < 10) super.volumeUp();
        else System.out.println("Max volume already reached");
    }

    public void setVolume(int volume)
    {
        if (volume < 10) super.setVolume(volume);
        else System.out.println("Max volume is 10");
    }

    public void channelUp()
    {
        if (this.getChannel() < 15) super.channelUp();
        else System.out.println("Max channel already reached");
    }

    public void setChannel(int channel)
    {
        if (channel < 15) super.setChannel(channel);
        else System.out.println("Max channel is 15");
    }
}
