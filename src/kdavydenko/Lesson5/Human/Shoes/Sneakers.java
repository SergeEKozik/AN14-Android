package kdavydenko.Lesson5.Human.Shoes;

public class Sneakers implements IShoes {

    public Sneakers() {
    }

    public void getDressed() {
        System.out.println("Кроссовки надеты");
    }

    public void undress() {
        System.out.println("Кроссовки сняты");
    }
}
