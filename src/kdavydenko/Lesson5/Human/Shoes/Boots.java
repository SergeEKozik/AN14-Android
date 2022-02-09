package kdavydenko.Lesson5.Human.Shoes;

public class Boots implements IShoes {

    public Boots() {

    }

    public void getDressed() {
        System.out.println("Ботинки надеты");
    }

    public void undress() {
        System.out.println("Ботинки сняты");
    }
}
