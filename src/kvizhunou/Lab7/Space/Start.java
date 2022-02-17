package kvizhunou.Lab7.Space;

public class Start {
    public static void main(String[] args) {
        Kosmodrom kosmo = new Kosmodrom();
        Rocket1 rock1 = new Rocket1();
        kosmo.launch(rock1);

        Rocket2 rock2 = new Rocket2();
        kosmo.launch(rock2);

        Rocket3 rock3 = new Rocket3();
        kosmo.launch(rock3);
    }
}
