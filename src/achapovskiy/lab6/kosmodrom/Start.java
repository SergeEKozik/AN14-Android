package achapovskiy.lab6.kosmodrom;

public class Start {
    public static void main(String[] args) {
        Kosmodrom kosmodrom = new Kosmodrom();
        Shuttle shuttle = new Shuttle();
        kosmodrom.launch(shuttle);

        Buran buran = new Buran();
        kosmodrom.launch(buran);

    }


    }

