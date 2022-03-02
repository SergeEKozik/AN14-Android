package skuksovsky.Lab10.Collections.OnlineShop;

public class Main {
    public static void main(String[] args) {
        ShopBasket basket = new ShopBasket();
        basket.addProduct("диван", 5);
        basket.addProduct("телевизор", 10);
        basket.addProduct("стол", 2);

        System.out.println(basket.getProducts().toString());
        System.out.println(basket.getProductQuantity("стол"));
        System.out.println(basket.toString());

        basket.removeProduct("стол");
        System.out.println(basket.toString());
    }
}
