package VNazarov.Lab05.TaskA1;

public class Room {
    public static void main(String[] args) {

        MusicPlayer player1 = new MusicPlayer("Ipod", "4", "Listening to music");
        player1.setBatteryWorkingAbility(true);
        player1.information();
        player1.playMusic();
        System.out.println("A few moments later...");
        player1.stopMusic();
        player1.charge();

        System.out.println();

        MusicPlayer player2 = new MusicPlayer("Panasonic", "Unknown music station", "Listening to music");
        player2.setBatteryWorkingAbility(false);
        player2.information();
        player2.charge();

        System.out.println();

        VideoPlayer player3 = new VideoPlayer("Samsung", "Unknown TV", "Watching videos");
        player3.setBatteryWorkingAbility(false);
        player3.isVideoOn = true;
        player3.information();
        player3.stopVideo();
    }
}
