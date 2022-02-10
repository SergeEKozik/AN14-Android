package achapovskiy.lab6.person.pants;

public class Pants implements IPants{
    @Override
    public void getDress(){
        System.out.println("надеть штаны");
    }

    @Override
    public void undress(){
        System.out.println("снять штаны");
    }
}

