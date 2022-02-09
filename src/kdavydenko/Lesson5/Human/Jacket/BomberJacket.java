package kdavydenko.Lesson5.Human.Jacket;

public class BomberJacket implements IJacket {

    public BomberJacket() {
    }

    public void getDressed() {
        System.out.println("Бомбер надет");
    }

    public void undress() {
        System.out.println("Бомбер снят");
    }
}
