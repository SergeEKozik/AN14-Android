package eveshtard.Lab10.Shop;

public class Shop {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addProduct("coffe", 1);
        System.out.println(basket.getProducts());
    }
}
