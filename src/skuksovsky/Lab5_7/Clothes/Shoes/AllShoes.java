package skuksovsky.Lab5_7.Clothes.Shoes;

public abstract class AllShoes implements Shoes {

    final private String MANUFACTURER;
    private boolean ifPutOn;

    public AllShoes (String MANUFACTURER) {
        this.MANUFACTURER = MANUFACTURER;
    }

    @Override
    public void putOn() {
        if (!ifPutOn) {
            System.out.println("Надел кроссовки от " + MANUFACTURER);
            ifPutOn = true;
        } else {
            System.out.println("Не могу надеть кроссовки, нужно их сперва снять!");
        }
    }

    @Override
    public void takeOff() {
        if (ifPutOn) {
            System.out.println("Снял кроссовки от " + MANUFACTURER);
            ifPutOn = false;
        } else {
            System.out.println("Не могу снять кроссовки, нужно их сперва надеть!");
        }
    }
}
