package akutsenkou.Lesson5_7.person.Pants;

public class Trousers implements IPants{
    @Override
    public void undress() {
        System.out.println("Undress trousers");
    }

    @Override
    public void dress() {
        System.out.println("Dress trousers");
    }
}
