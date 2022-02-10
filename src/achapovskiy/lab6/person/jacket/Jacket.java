package achapovskiy.lab6.person.jacket;

public class Jacket implements IJacket {
    @Override
    public void getDress(){
        System.out.println("надеть куртку");
    }

    @Override
    public void undress(){
        System.out.println("cнять куртку");
    }
}
