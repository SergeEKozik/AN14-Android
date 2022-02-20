package skuksovsky.Lab5_7.Clothes.Pants;

public abstract class  AllPants implements Pants {

    final private String MANUFACTURER;
    private boolean ifPutOn;

    public AllPants(String MANUFACTURER) {
        this.MANUFACTURER = MANUFACTURER;
    }

    @Override
    public void putOn() {
        if (!ifPutOn) {
            System.out.println("Надел штаны от " + MANUFACTURER);
            ifPutOn = true;
        } else {
            System.out.println("Не могу надеть штаны, нужно их сперва снять!");
        }
    }

    @Override
    public void takeOff() {
        if (ifPutOn) {
            System.out.println("Снял штаны от " + MANUFACTURER);
            ifPutOn = false;
        } else {
            System.out.println("Не могу снять штаны, нужно их сперва надеть!");
        }
    }
}
