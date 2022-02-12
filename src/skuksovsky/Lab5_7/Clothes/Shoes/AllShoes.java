package skuksovsky.Lab5_7.Clothes.Shoes;

public abstract class AllShoes implements Shoes {

    private String manufacturer;
    private boolean ifPutOn;

    public AllShoes (String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void putOn() {
        if (!ifPutOn) {
            System.out.println("Надел кроссовки от " + manufacturer);
            ifPutOn = true;
        } else {
            System.out.println("Не могу надеть кроссовки, нужно их сперва снять!");
        }
    }

    @Override
    public void takeOff() {
        if (ifPutOn) {
            System.out.println("Снял кроссовки от " + manufacturer);
            ifPutOn = false;
        } else {
            System.out.println("Не могу снять кроссовки, нужно их сперва надеть!");
        }
    }
}
