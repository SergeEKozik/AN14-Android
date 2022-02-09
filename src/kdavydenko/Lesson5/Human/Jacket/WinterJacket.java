package kdavydenko.Lesson5.Human.Jacket;

public class WinterJacket implements IJacket {

    public WinterJacket() {

    }

    public void getDressed() {
        System.out.println("Зимняя куртка надета");
    }

    public void undress() {
        System.out.println("Зимняя куртка снята");
    }
}
