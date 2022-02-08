package akutsenkou.person.Shoes;

public class Sneakers implements IShoes{
    @Override
    public void undress() {
        System.out.println("Undress sneakers");
    }

    @Override
    public void dress() {
        System.out.println("Dress sneakers");
    }
}
