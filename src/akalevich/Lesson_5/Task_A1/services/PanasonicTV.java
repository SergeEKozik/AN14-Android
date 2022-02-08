package akalevich.Lesson_5.Task_A1.services;

public class PanasonicTV extends  TV{
    public PanasonicTV(String name, boolean remoteControllerExist) {
        super(name, remoteControllerExist);
        if (remoteControllerExist == true) System.out.println("Now You have TV from Panasonic. Max volume = 15, This Device have 6 channels. User Name = " + this.getName() + " and You have remote controller for this device");
        else System.out.println("Now You have TV from Panasonic. Max volume = 15, This Device have 6 channels. User Name = " + this.getName() + " and You haven't remote controller for this device");
    }

    public void volumeUp()
    {
        if (this.getVolume() < 15) super.volumeUp();
        else System.out.println("Max volume already reached");
    }

    public void setVolume(int volume)
    {
        if (volume < 15) super.setVolume(volume);
        else System.out.println("Max volume is 15");
    }

    public void channelUp()
    {
        if (this.getChannel() < 6) super.channelUp();
        else System.out.println("Max channel already reached");
    }

    public void setChannel(int channel)
    {
        if (channel < 6) super.setChannel(channel);
        else System.out.println("Max channel is 6");
    }
}
