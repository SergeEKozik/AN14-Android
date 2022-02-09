package akutsenkou.Lesson5_7.person.Jakcet;

public class Coat implements IJakcet{
    @Override
    public void undress() {
        System.out.println("Undress coat");
    }

    @Override
    public void dress() {
        System.out.println("Dress coat");
    }
}
