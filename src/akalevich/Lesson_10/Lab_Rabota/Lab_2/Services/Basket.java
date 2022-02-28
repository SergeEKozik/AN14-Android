package akalevich.Lesson_10.Lab_Rabota.Lab_2.Services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Basket implements IBasket {

    private Map<String, Integer> basket = new HashMap<>();

    public Basket() {
    }

    public void showBasket() {
        if (!basket.isEmpty()) {
            for (Map.Entry<String, Integer> entry : basket.entrySet()) {
                System.out.println("Product: " + entry.getKey() + "; Quantity: " + entry.getValue());
            }
        } else {
            System.out.println("Basket is Empty");
        }
    }

    public void addProduct(String product, int quantity) {
        basket.put(product, quantity);
    }

    public void removeProduct(String product) {
        basket.remove(product);
    }

    public void updateProductQuantity(String product, int quantity) {
        basket.replace(product, quantity);
    }

    public void clear() {
        basket.clear();
    }

    public List<String> getProducts() {
        return new ArrayList<String>(basket.keySet());
    }

    public int getProductQuantity(String product) {
        return basket.get(product);
    }
}
