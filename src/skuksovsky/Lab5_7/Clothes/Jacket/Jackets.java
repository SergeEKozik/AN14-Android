package skuksovsky.Lab5_7.Clothes.Jacket;

public abstract class Jackets implements Jacket {
    final private String MANUFACTURER;
    private boolean ifPutOn;

    public Jackets(String MANUFACTURER) {
        this.MANUFACTURER = MANUFACTURER;
    }

    @Override
    public void putOn() {
        if (!ifPutOn) {
            System.out.println("Надел куртку от " + MANUFACTURER);
            ifPutOn = true;
        } else {
            System.out.println("Не могу надеть куртку, нужно ее сперва снять!");
        }
    }

    @Override
    public void takeOff() {
        if (ifPutOn) {
            System.out.println("Снял куртку от " + MANUFACTURER);
            ifPutOn = false;
        } else {
            System.out.println("Не могу снять куртку, нужно ее сперва надеть!");
        }
    }
}
