package achapovskiy.lab6.person.shoes;

public class Shoes implements IShoes {
    @Override
    public void getDress() {
        System.out.println("обуться");
    }

    @Override
    public void undress() {
        System.out.println("разуться");
    }
}
