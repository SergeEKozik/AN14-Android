package skuksovsky.Lab5_7.Clothes.Jacket;

public abstract class Jackets implements Jacket {
    private String manufacturer;
    private boolean ifPutOn;

    public Jackets(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void putOn() {
        if (!ifPutOn) {
            System.out.println("Надел куртку от " + manufacturer);
            ifPutOn = true;
        } else {
            System.out.println("Не могу надеть куртку, нужно ее сперва снять!");
        }
    }

    @Override
    public void takeOff() {
        if (ifPutOn) {
            System.out.println("Снял куртку от " + manufacturer);
            ifPutOn = false;
        } else {
            System.out.println("Не могу снять куртку, нужно ее сперва надеть!");
        }
    }
}
