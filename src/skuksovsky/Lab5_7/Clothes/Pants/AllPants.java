package skuksovsky.Lab5_7.Clothes.Pants;

public abstract class  AllPants implements Pants {

    private String manufacturer;
    private boolean ifPutOn;

    public AllPants(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void putOn() {
        if (!ifPutOn) {
            System.out.println("Надел штаны от " + manufacturer);
            ifPutOn = true;
        } else {
            System.out.println("Не могу надеть штаны, нужно их сперва снять!");
        }
    }

    @Override
    public void takeOff() {
        if (ifPutOn) {
            System.out.println("Снял штаны от " + manufacturer);
            ifPutOn = false;
        } else {
            System.out.println("Не могу снять штаны, нужно их сперва надеть!");
        }
    }
}
