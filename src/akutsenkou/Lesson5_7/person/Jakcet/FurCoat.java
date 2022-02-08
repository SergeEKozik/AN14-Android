package akutsenkou.Lesson5_7.person.Jakcet;

public class FurCoat implements IJakcet{
    @Override
    public void undress() {
        System.out.println("Undress fur coat");
    }

    @Override
    public void dress() {
        System.out.println("Dress fur coat");
    }
}
