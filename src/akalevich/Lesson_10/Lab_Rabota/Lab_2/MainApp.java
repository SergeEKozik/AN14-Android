package akalevich.Lesson_10.Lab_Rabota.Lab_2;

import akalevich.Lesson_10.Lab_Rabota.Lab_2.Services.Basket;

public class MainApp {
    public static void main(String[] args) {
        Basket basket = new Basket();
        test(basket);
    }

    private static void test(Basket basket) {
        basket.addProduct("A", 3);
        basket.addProduct("B", 1);
        basket.addProduct("C",1);
        basket.showBasket();
        basket.updateProductQuantity("B", 3);
        basket.removeProduct("A");
        System.out.println(basket.getProductQuantity("C"));
        System.out.println(basket.getProducts());
        basket.showBasket();
        basket.clear();
        basket.showBasket();
    }
}

